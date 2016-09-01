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

#ifndef natives_h
#define natives_h

#include <stdio.h>
#include <stdlib.h>
#include "jni.h"
#include <iosfwd>

#ifndef NATIVE_METHOD
#define NATIVE_METHOD(className, functionName, signature) \
{ #functionName, signature, reinterpret_cast<void*>(className ## _ ## functionName) }
#endif
#define REGISTER_NATIVE_METHODS(jni_class_name) \
RegisterNativeMethods(env, jni_class_name, gMethods, arraysize(gMethods))

#endif /* natives_h */
