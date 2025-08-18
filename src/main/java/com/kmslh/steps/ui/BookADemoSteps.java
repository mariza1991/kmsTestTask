package com.kmslh.steps.ui;

import com.kmslh.dto.User;
import com.kmslh.pages.BookADemoPage;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookADemoSteps {

    final BookADemoPage bookADemo;

    @Step("Fill form with user data")
    public void fillBookADemoForm(User user) {
        bookADemo.enterFirstName(user.getFirstname());
        bookADemo.enterLastName(user.getLastname());
        bookADemo.enterPhone(user.getPhone());
        bookADemo.enterEmail(user.getEmail());
        bookADemo.enterJobTitle(user.getJobtitle());
        bookADemo.enterMessage(user.getMessage());
        bookADemo.selectCountry(user.getCountry().getDisplayName());
    }

    @Step("Validate all form fields are interactable")
    public void validateFormFields(User user) {
        bookADemo.assertFieldsAreInteractable(user);
        //TODO можно добавить что капча на странице есть
    }
}
