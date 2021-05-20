/*
 Copyright (C) 2016 Migeran
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

#include "natives.h"

#define ALOGI(...) printf(__VA_ARGS__)
#define ALOGE(...) printf(__VA_ARGS__)

static const char *classPathName = "org/moe/moe/fastjni/Test";

void RegisterNativeMethods(JNIEnv* env, const char* jni_class_name, const JNINativeMethod* methods,
                           jint method_count);

#undef NATIVE_METHOD
#define NATIVE_METHOD(className, functionName, signature, identifier) \
{ #functionName, signature, reinterpret_cast<void*>(className ## _ ## identifier) }

#define EXPORT static

inline jint calcsum(JNIEnv* env, jbyteArray arr1) {
    jboolean isCopy;
    jsize size = env->GetArrayLength(arr1);
    jbyte* buffer = (jbyte*)env->GetPrimitiveArrayCritical(arr1, &isCopy);
    if (env->ExceptionCheck()) return -1;
    
    jint sum = 0;
    for (jsize i = 0; i < size; ++i) {
        sum += buffer[i];
    }
    
    env->ReleasePrimitiveArrayCritical(arr1, buffer, 0);
    if (env->ExceptionCheck()) return -1;
    return sum;
}

EXPORT jint Test_jni(JNIEnv* env, jobject java_this, jbyteArray array) {
    return calcsum(env, array);
}

EXPORT jint Test_fastjni(JNIEnv* env, jobject java_this, jbyteArray array) {
    return calcsum(env, array);
}

static JNINativeMethod methods[] = {
    NATIVE_METHOD(Test, jni, "([B)I", jni),
    NATIVE_METHOD(Test, fastjni, "([B)I", fastjni),
};

/*
 * Register several native methods for one class.
 */
static int registerNativeMethods(JNIEnv* env, const char* className,
                                 JNINativeMethod* gMethods, int numMethods)
{
    jclass clazz;
    clazz = env->FindClass(className);
    if (clazz == NULL) {
        ALOGE("Native registration unable to find class '%s'", className);
        return JNI_FALSE;
    }
    if (env->RegisterNatives(clazz, gMethods, numMethods) < 0) {
        ALOGE("RegisterNatives failed for '%s'", className);
        return JNI_FALSE;
    }
    return JNI_TRUE;
}
/*
 * Register native methods for all classes we know about.
 *
 * returns JNI_TRUE on success.
 */
static int registerNatives(JNIEnv* env)
{
    if (!registerNativeMethods(env, classPathName,
                               methods, sizeof(methods) / sizeof(methods[0]))) {
        return JNI_FALSE;
    }
    return JNI_TRUE;
}
// ----------------------------------------------------------------------------
/*
 * This is called by the VM when the shared library is first loaded.
 */

typedef union {
    JNIEnv* env;
    void* venv;
} UnionJNIEnvToVoid;

extern "C" __attribute__((visibility ("default"))) jint JNI_OnLoad_test(JavaVM* vm, void* reserved)
{
    UnionJNIEnvToVoid uenv;
    uenv.venv = NULL;
    jint result = -1;
    JNIEnv* env = NULL;
    
    ALOGI("JNI_OnLoad");
    if (vm->GetEnv(&uenv.venv, JNI_VERSION_1_4) != JNI_OK) {
        ALOGE("ERROR: GetEnv failed");
        goto bail;
    }
    env = uenv.env;
    if (registerNatives(env) != JNI_TRUE) {
        ALOGE("ERROR: registerNatives failed");
        goto bail;
    }

    result = JNI_VERSION_1_4;

bail:
    return result;
}