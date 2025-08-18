package com.kmslh.td;

import com.kmslh.dto.Country;
import com.kmslh.dto.User;

public class UiTestData {

    public static User validUser() {
        return User.builder()
                .firstname("Marina")
                .lastname("Kozlova")
                .email("marina.qa@gmail.com")
                .phone("031345432")
                .jobtitle("QA in Test Ltd")
                .message("Book a demo request")
                .country(Country.SERBIA)
                .build();
    }
}
