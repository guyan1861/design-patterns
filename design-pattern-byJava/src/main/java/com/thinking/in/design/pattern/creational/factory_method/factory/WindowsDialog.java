package com.thinking.in.design.pattern.creational.factory_method.factory;

import com.thinking.in.design.pattern.creational.factory_method.buttons.Button;
import com.thinking.in.design.pattern.creational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
