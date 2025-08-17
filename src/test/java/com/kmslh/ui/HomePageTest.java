package com.kmslh.ui;

import com.kmslh.BaseUiTest;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseUiTest {

    @Test
    void homePage_shouldOpen() {
        ui.homePageSteps.openHomePage();
        holdBrowserOpened();
    }
}
