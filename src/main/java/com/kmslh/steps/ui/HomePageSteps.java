package com.kmslh.steps.ui;

import com.kmslh.pages.HomePage;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HomePageSteps {

    final HomePage homePage;

    @Step("Open home page")
    public void openHomePage() {
        homePage.open();
        homePage.checkWasOpened();
    }
}
