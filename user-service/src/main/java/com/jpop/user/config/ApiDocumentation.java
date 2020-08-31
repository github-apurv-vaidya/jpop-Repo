package com.jpop.user.config;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class ApiDocumentation {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("User Service Documentation")
                        .description("API Documentation for User Service JPOP")
                        .version("0.0.1"));
    }
    
    @Bean
    public Sampler getSampler()
    {
    	return Sampler.ALWAYS_SAMPLE;
    }
}
