## Explain in a few sentences what part of the system would you automate and why

**API:** Automatically collect all URLs from the `/sitemap_index.xml` and check each for availability and response time against a defined SLA, running requests in a paced worker pool to avoid overloading prod. This is essential because manual coverage is impossible and would miss 4xx/5xx errors and latency regressions.

**UI:** Verify that `/book-a-demo` is reachable from the key product pages (**Call Center**, **Self Service**, **Onboarding & Training**, **Field Service**) via working links/CTAs (call to action). This matters because those pages drive leads, so any broken path directly hurts conversions.
