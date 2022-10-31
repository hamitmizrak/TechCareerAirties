package com.hamitmizrak.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sozel_deparment")
public class Sozel implements IChooise {
    @Override
    public String message(String name) {
        return "Sözel Bölüm "+name;
    }
}
