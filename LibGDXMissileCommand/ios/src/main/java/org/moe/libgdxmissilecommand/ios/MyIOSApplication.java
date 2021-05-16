package org.moe.libgdxmissilecommand.ios;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationLogger;
import com.badlogic.gdx.backends.iosmoe.IOSApplication;
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration;

public class MyIOSApplication extends IOSApplication {

    public MyIOSApplication(ApplicationListener listener, IOSApplicationConfiguration config) {
        super(listener, config);
    }

    @Override
    public void setApplicationLogger(ApplicationLogger applicationLogger) {
        super.setApplicationLogger(new MyLogger());
    }
}
