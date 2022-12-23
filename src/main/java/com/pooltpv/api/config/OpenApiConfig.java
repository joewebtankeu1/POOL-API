package com.pooltpv.api.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("POOL TPV API")
                        .description("")
                        .termsOfService("terms")
                        .contact(new Contact().email("contact-it@pooltpv.cm"))
                        .license(new License().name("GNU"))
                        .version("1.0")
                );
    }
}

