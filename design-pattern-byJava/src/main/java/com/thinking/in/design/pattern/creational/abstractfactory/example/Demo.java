package com.thinking.in.design.pattern.creational.abstractfactory.example;

import com.thinking.in.design.pattern.creational.abstractfactory.app.Application;
import com.thinking.in.design.pattern.creational.abstractfactory.factories.GUIFactory;
import com.thinking.in.design.pattern.creational.abstractfactory.factories.MacOSFactory;
import com.thinking.in.design.pattern.creational.abstractfactory.factories.WindowsFactory;

public class Demo {


    public static Application configApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configApplication();
        app.paint();
    }
}
