package com.kmslh.ui;

import com.kmslh.BaseUiTest;
import com.kmslh.dto.User;
import com.kmslh.td.UiTestData;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class BookADemoFormTest extends BaseUiTest {

    @Test
    @Description("Check Book a Demo form can be filled with valid data")
    void checkFormCanBeFilledWithValidData() {
        ui.homePageSteps.openHomePage();
        ui.homePageSteps.navigateToBookADemoFromHeader();
        //TODO ui.homePageSteps.bookADemoFromHeroBlock();

        User validUser = UiTestData.validUser();
        ui.bookADemoSteps.fillBookADemoForm(validUser);
        ui.bookADemoSteps.validateFormFields(validUser);
    }
}
