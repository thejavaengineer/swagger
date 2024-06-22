package com.thejavaengineer.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OpenApiConfig {

    private final String apiLocation;

    public OpenApiConfig(@Value("${app.api-resource.api-location}") String apiLocation) {
        this.apiLocation = apiLocation;
    }

    @Bean
    public OpenAPI customOpenApi() {
        return Optional.ofNullable(new OpenAPIV3Parser().read(apiLocation))
                .orElseThrow()
                .servers(null);
    }
}
