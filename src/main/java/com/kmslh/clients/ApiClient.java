package com.kmslh.clients;

import feign.Param;
import feign.RequestLine;
import feign.Response;

public interface ApiClient {
    @RequestLine("GET /sitemap_index.xml")
    Response getSitemapIndex();

    @RequestLine("GET {path}")
    Response getByPath(@Param("path") String path);
}
