package com.hamitmizrak.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sayisal_deparment")
public class Sayisal implements IChooise {
    @Override
    public String message(String name) {
        return "Sayisal Bölüm "+name;
    }
}