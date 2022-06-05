package com.thinking.in.design.pattern.creational.factory_method.factory;

import com.thinking.in.design.pattern.creational.factory_method.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
