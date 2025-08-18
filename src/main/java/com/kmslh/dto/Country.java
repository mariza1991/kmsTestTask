package com.kmslh.dto;

import lombok.Getter;

@Getter
public enum Country {
    SERBIA("Serbia"),
    USA("United States"),
    GERMANY("Germany"),
    FRANCE("France");

    private final String displayName;

    Country(String displayName) {
        this.displayName = displayName;
    }

}
