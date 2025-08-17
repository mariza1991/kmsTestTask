package com.kmslh.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "kmslh.ui")
public class UiConfig {
    private String browser;
    private boolean headless;
    private int timeoutMs;
    private String resolution;
}
