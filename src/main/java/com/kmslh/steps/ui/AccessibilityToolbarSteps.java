package com.kmslh.steps.ui;

import com.kmslh.pages.components.AccessibilityToolbar;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Component
@RequiredArgsConstructor
public class AccessibilityToolbarSteps {

    final AccessibilityToolbar accessibilityToolbar;

    @Step("Validate default state of checkboxes")
    public void validateDefaultStateOfCheckboxes() {
        accessibilityToolbar.checkFormatSizeCheckboxDefaultState();
        accessibilityToolbar.checkNightsStayCheckboxDefaultState();
        accessibilityToolbar.checkLinkCheckboxDefaultState();
        accessibilityToolbar.checkReadableFontCheckboxDefaultState();
    }

    @Step("Enable Highlight Link checkbox")
    public void enableHighlightLinkCheckbox() {
        accessibilityToolbar.enableHighlightLinkCheckbox();
    }

    @Step("Disable Highlight Link checkbox")
    public void disableHighlightLinkCheckbox() {
        accessibilityToolbar.enableHighlightLinkCheckbox();
        accessibilityToolbar.checkLinkCheckboxDefaultState();
    }

    @Step("Check link color before enabling 'Highlight Links'" +
            "checkbox is differ than after")
    public void checkLinkColorChanged(String colorBefore, String colorAfter) {
        assertNotEquals(colorBefore, colorAfter,
                "Link color should be changed");
    }
}
