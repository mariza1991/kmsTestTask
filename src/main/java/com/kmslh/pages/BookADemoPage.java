package com.kmslh.pages;

import com.kmslh.configs.BaseConfig;
import com.kmslh.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

@Component
@RequiredArgsConstructor
public class BookADemoPage {

    private final BaseConfig config;

    private final String bookADemoUrl = "/book-a-demo/";
    private final String bookADemoFormXpath = "//*[@data-id='76472ef']";

    private final String firstnameInputXpath = "//input[@name='firstname']";
    private final String lastnameInputXpath = "//input[@name='lastname']";
    private final String emailInputXpath = "//input[@name='email']";
    private final String phoneInputXpath = "//input[@name='phone']";
    private final String jobtitleInputXpath = "//input[@name='jobtitle']";
    private final String messageTextareaXpath = "//textarea[@name='message']";
    private final String countrySelectXpath = "//select[@name='country']";

    public void bookADemoPageIsLoaded() {
        webdriver().shouldHave(url(config.getBaseUrl() + bookADemoUrl));
        $x(bookADemoFormXpath).should(visible);
    }

    public void enterFirstName(String firstName) {
        $x(firstnameInputXpath).shouldBe(visible, enabled).setValue(firstName);
    }

    public void enterLastName(String lastName) {
        $x(lastnameInputXpath).shouldBe(visible, enabled).setValue(lastName);
    }

    public void enterEmail(String email) {
        $x(emailInputXpath).shouldBe(visible, enabled).setValue(email);
    }

    public void enterPhone(String phone) {
        $x(phoneInputXpath).shouldBe(visible, enabled).setValue(phone);
    }

    public void enterJobTitle(String jobTitle) {
        $x(jobtitleInputXpath).shouldBe(visible, enabled).setValue(jobTitle);
    }

    public void enterMessage(String message) {
        $x(messageTextareaXpath).shouldBe(visible, enabled).setValue(message);
    }

    public void selectCountry(String country) {
        $x(countrySelectXpath).shouldBe(visible, enabled).selectOption(country);
    }

    private void assertInputInteractable(String xpath, String value) {
        $x(xpath).shouldHave(value(value));
    }

    public void assertFieldsAreInteractable(User user) {
        assertInputInteractable(firstnameInputXpath, user.getFirstname());
        assertInputInteractable(lastnameInputXpath, user.getLastname());
        assertInputInteractable(emailInputXpath, user.getEmail());
        assertInputInteractable(phoneInputXpath, user.getPhone());
        assertInputInteractable(jobtitleInputXpath, user.getJobtitle());
        assertInputInteractable(messageTextareaXpath, user.getMessage());

        $x(countrySelectXpath).shouldHave(selectedText(user.getCountry().getDisplayName()));
    }
}
