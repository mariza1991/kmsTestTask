package com.kmslh.api;

import com.kmslh.BaseApiTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SitemapTest extends BaseApiTest {

    @Test
    void sitemapIndex_shouldReturn200() {
        var response = apiClient.getSitemapIndex();
        assertThat(response.status()).isEqualTo(200);
    }
}
