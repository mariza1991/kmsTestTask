package com.kmslh.configs;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "kmslh")
public class BaseConfig {
    private String baseUrl;
}
