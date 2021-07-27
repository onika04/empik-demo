package com.example.empik.config;

import com.example.empik.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

   /* @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            User user = restTemplate.getForObject(
                    "https://quoters.apps.pcfone.io/api/random", User.class);
            System.out.println("Ups... I have a problem.");
        };
    }*/
}
