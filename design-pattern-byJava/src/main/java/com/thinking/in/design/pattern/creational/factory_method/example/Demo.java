package com.thinking.in.design.pattern.creational.factory_method.example;

import com.thinking.in.design.pattern.creational.factory_method.factory.Dialog;
import com.thinking.in.design.pattern.creational.factory_method.factory.HtmlDialog;
import com.thinking.in.design.pattern.creational.factory_method.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    static void configure() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }
}
