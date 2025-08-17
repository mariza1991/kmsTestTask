package com.kmslh;

import com.kmslh.clients.ApiClient;
import com.kmslh.configs.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestConfig.class)
public class BaseApiTest {

    @Autowired
    protected ApiClient apiClient;
}
