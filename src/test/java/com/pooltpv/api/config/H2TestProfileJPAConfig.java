package com.pooltpv.api.jwtpool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "org.baeldung.repository",
        "org.baeldung.boot.repository"
})
@EnableTransactionManagement
public class H2TestProfileJPAConfig {
}
