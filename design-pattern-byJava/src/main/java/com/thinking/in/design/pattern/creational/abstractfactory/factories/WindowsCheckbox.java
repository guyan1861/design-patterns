package com.thinking.in.design.pattern.creational.abstractfactory.factories;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have crated WindowsCheckbox.");
    }
}
