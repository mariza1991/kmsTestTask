package com.kmslh.utils;

import com.codeborne.selenide.SelenideElement;

public class CssUtils {

    public static String getElementColor(SelenideElement element) {
        return element.getCssValue("color");
    }
}
