package com.thinking.in.design.pattern.creational.abstractfactory.app;

import com.thinking.in.design.pattern.creational.abstractfactory.factories.Button;
import com.thinking.in.design.pattern.creational.abstractfactory.factories.Checkbox;
import com.thinking.in.design.pattern.creational.abstractfactory.factories.GUIFactory;

public class Application {
    public Button button;
    public Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
