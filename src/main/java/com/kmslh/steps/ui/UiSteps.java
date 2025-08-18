package com.kmslh.steps.ui;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UiSteps {
    public final HomePageSteps homePageSteps;
    public final BookADemoSteps bookADemoSteps;
    public final AccessibilityToolbarSteps accessibilityToolbarSteps;
    public final HeaderSteps headerSteps;
}
