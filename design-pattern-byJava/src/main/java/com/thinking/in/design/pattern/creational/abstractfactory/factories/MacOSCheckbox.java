package com.thinking.in.design.pattern.creational.abstractfactory.factories;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
