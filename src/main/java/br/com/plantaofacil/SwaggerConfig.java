package br.com.plantaofacil;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Plantão Fácil")
                        .version("v.1")
                        .description("Gestão de plantões para médicos")
                        .termsOfService("http://google.com.br")
                        .contact(new Contact().name("Juan Lorenzo Leiro")
                                .email("juan.lorenzo.leiro@gmail.com")
                                .url("https://github.com/juanleirojl"))
                        .license(new License().name(" JL © 2024")
                                ));
    }
}