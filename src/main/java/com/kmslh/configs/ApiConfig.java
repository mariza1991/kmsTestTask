package com.kmslh.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "kmslh.api")
public class ApiConfig {
    private String userAgent;
    private int requestDelayMs;
    private Timeouts timeouts;

    @Data
    public static class Timeouts {
        private int connectMs;
        private int readMs;
    }
}
