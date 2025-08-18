package com.kmslh.steps.ui;

import com.kmslh.pages.components.Header;
import com.kmslh.utils.CssUtils;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeaderSteps {

    final Header header;

    @Step("Get header link color")
    public String getHeaderLinkColor() {
        return CssUtils.getElementColor(header.getHeaderLogoLink());
    }
}
