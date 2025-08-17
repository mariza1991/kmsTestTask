package com.kmslh.pages;

import com.codeborne.selenide.Selenide;
import com.kmslh.configs.BaseConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;

@Component
@RequiredArgsConstructor
public class HomePage {

    @Getter
    private final BaseConfig config;

    private final String mainContentXpath = "//*[@data-elementor-type='wp-page']";

    public void open() {
        Selenide.open(config.getBaseUrl());
    }

    public void checkWasOpened() {
        $x(mainContentXpath).should(exist);
    }
}
