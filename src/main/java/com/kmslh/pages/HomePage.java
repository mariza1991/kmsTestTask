package com.kmslh.pages;

import com.codeborne.selenide.Selenide;
import com.kmslh.configs.BaseConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@Component
@RequiredArgsConstructor
public class HomePage {

    @Getter
    protected final BaseConfig config;

    private final String mainContentXpath = "//*[@data-elementor-type='wp-page']";
    private final String bookADemoBtnXpath = "//*[@data-id='566e46f']//a";
    private final String heroBlockContentXpath = "//*[@data-widget-number='180617408']";

    public void open() {
        Selenide.open(config.getBaseUrl());
    }

    public void checkWasOpened() {
        $x(mainContentXpath).should(exist);
    }

    public void waitHeroBlockIsLoaded() {
        $x(bookADemoBtnXpath).should(visible);
    }

    public void clickOnBookADemo() {
        $x(heroBlockContentXpath).click();
    }

    public void scrollDownToHeroBlock() {

    }
}
