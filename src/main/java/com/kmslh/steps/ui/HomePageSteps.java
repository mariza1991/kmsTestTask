package com.kmslh.steps.ui;

import com.kmslh.pages.HomePage;
import com.kmslh.pages.BookADemoPage;
import com.kmslh.pages.components.AccessibilityToolbar;
import com.kmslh.pages.components.Header;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HomePageSteps {

    final HomePage homePage;
    final BookADemoPage bookADemo;
    final Header header;
    final AccessibilityToolbar accessibilityToolbar;

    @Step("Open home page")
    public void openHomePage() {
        homePage.open();
        homePage.checkWasOpened();
    }

    @Step("Book a demo from Hero block")
    public void bookADemoFromHeroBlock() {
        homePage.waitHeroBlockIsLoaded();
        homePage.clickOnBookADemo();
    }

    @Step("Book a demo from header")
    public void navigateToBookADemoFromHeader() {
        header.waitHeaderIsLoaded();
        header.clickOnBookADemo();
        bookADemo.bookADemoPageIsLoaded();
    }

    @Step("Open Accessibility Toolbar")
    public void openAccessibilityToolbar() {
        header.waitHeaderIsLoaded();
        accessibilityToolbar.clickOnAccessibilityToolbarBtn();
        accessibilityToolbar.waitToolbarOpened();
    }

}
