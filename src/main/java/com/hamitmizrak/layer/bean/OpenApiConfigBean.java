package com.hamitmizrak.layer.bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfigBean {

    @Bean
    public OpenAPI openAPIBeanMethod(){
        return new OpenAPI()
                .info(new Info()
                        .title("HEader 78541")
                        .description("tanımlama")
                        .version("v4")
                        .contact(new Contact().name("Hamit").url("https://www.").email("hamitmizrak@gmail.com"))
                        .termsOfService("INC"));
    }
}
