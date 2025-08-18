package com.kmslh;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.kmslh.configs.TestConfig;
import com.kmslh.configs.UiConfig;
import com.kmslh.steps.ui.UiSteps;
import com.kmslh.td.UiTestData;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestConfig.class)
@Log4j2
public class BaseUiTest {

    @Autowired
    private UiConfig config;

    @Autowired
    protected UiSteps ui;

    protected UiTestData testData;

    @BeforeEach
    void setUp() {
        Configuration.timeout = config.getTimeoutMs();
        Configuration.browserSize = config.getResolution();

        Configuration.browser = config.getBrowser();

        var options = new org.openqa.selenium.chrome.ChromeOptions();
        options.addArguments("--incognito");
        Configuration.browserCapabilities = options;
    }

    @AfterEach
    void tearDown() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            log.info("Close the browser if opened");
            Selenide.closeWebDriver();
        }
    }

    public void holdBrowserOpened() {
        log.info("Debug mode");
        Configuration.holdBrowserOpen = true;
    }
}
