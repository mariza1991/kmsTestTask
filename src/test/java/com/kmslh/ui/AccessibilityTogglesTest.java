package com.kmslh.ui;

import com.kmslh.BaseUiTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class AccessibilityTogglesTest extends BaseUiTest {

    @Test
    @Description("Validate Default State of Accessibility Toggles")
    void checkDefaultTogglesState() {
        ui.homePageSteps.openHomePage();
        ui.homePageSteps.openAccessibilityToolbar();
        ui.accessibilityToolbarSteps.validateDefaultStateOfCheckboxes();
    }

    @Test
    @Description("Validate Highlight Link Checkbox Behavior")
    void checkHighlightLinkCheckboxBehavior() {
        ui.homePageSteps.openHomePage();
        ui.homePageSteps.openAccessibilityToolbar();

        String haderColorBefore = ui.headerSteps.getHeaderLinkColor();
        ui.accessibilityToolbarSteps.enableHighlightLinkCheckbox();
        String haderColorAfter = ui.headerSteps.getHeaderLinkColor();
        ui.accessibilityToolbarSteps.checkLinkColorChanged(haderColorBefore, haderColorAfter);
        ui.accessibilityToolbarSteps.disableHighlightLinkCheckbox();

    }
}
