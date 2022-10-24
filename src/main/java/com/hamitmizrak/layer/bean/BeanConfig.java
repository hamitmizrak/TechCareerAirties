package com.hamitmizrak.layer.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(name = "beandata44",initMethod = "initialBean",destroyMethod = "destroyBean")
    //@Scope("request")
    //@Scope("session")
    public BeanDto beanDtoMethod(){
        return BeanDto.builder().beanName("bean adı").beanData("bean data").build();
    }
}
