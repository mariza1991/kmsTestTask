package com.kmslh.configs;

import com.kmslh.clients.ApiClient;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.okhttp.OkHttpClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.kmslh.steps.ui",
        "com.kmslh.pages",
})
@EnableConfigurationProperties({ApiConfig.class, BaseConfig.class, UiConfig.class})
@Log4j2
public class TestConfig {

    @Bean
    public ApiClient apiClient(BaseConfig baseConfig) {
        log.info("Create API client with baseUrl={}", baseConfig.getBaseUrl());
        return Feign.builder()
                .client(new OkHttpClient())
                .decoder(new JacksonDecoder())
                .target(ApiClient.class, baseConfig.getBaseUrl());
    }
}
