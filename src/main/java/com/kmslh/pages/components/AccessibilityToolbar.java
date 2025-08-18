package com.kmslh.pages.components;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

@Component
public class AccessibilityToolbar {

    private final SelenideElement accessibilityToolbarBtn = $("#acwp-toolbar-btn");
    private final SelenideElement accessibilityToolbar = $("#acwp-toolbar");
    private final SelenideElement formatSizeCheckbox = $("#acwp-toggler-incfont");
    private final SelenideElement nightsStayCheckbox = $("#acwp-toggler-contrast");
    private final SelenideElement readableFontCheckbox = $("#acwp-toggler-readable");
    private final SelenideElement linkCheckbox = $("#acwp-toggler-underline");

    private final String linkCheckboxXpath = "label[for='acwp-toggler-underline']";

    public void waitToolbarOpened() {
        accessibilityToolbar.should(visible);
    }

    public void clickOnAccessibilityToolbarBtn() {
        accessibilityToolbarBtn.click();
    }

    public void checkFormatSizeCheckboxDefaultState() {
        formatSizeCheckbox.shouldNotBe(checked);
    }

    public void checkNightsStayCheckboxDefaultState() {
        nightsStayCheckbox.shouldNotBe(checked);
    }

    public void checkReadableFontCheckboxDefaultState() {
        readableFontCheckbox.shouldNotBe(checked);
    }

    public void checkLinkCheckboxDefaultState() {
        linkCheckbox.shouldNotBe(checked);
    }

    public void enableHighlightLinkCheckbox() {
        $(linkCheckboxXpath).shouldBe(visible, enabled).click();
    }
}
