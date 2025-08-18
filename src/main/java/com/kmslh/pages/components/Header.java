package com.kmslh.pages.components;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class Header {

    private final String bookADemoBtn = "//a[contains(@href, 'book-a-demo')]";
    private final String headerXpath = "//header[@class='header_panel']";
    private final String headerLogoLinkXpath = "//a[@class='header_panel__logo-link']";

    public void waitHeaderIsLoaded() {
        $x(headerXpath).should(visible);
    }

    public void clickOnBookADemo() {
        $x(headerXpath + bookADemoBtn).click();
    }

    public SelenideElement getHeaderLogoLink() {
        return $x(headerLogoLinkXpath);
    }
}
