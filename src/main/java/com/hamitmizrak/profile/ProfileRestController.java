package com.hamitmizrak.profile;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//lombok
@Log4j2
@RequiredArgsConstructor

@RestController
@RequestMapping("/profile")
public class ProfileRestController {

    private final IChooise iChooise;

    // http:localhost:8080/profile/chooise/Mehmet
    @GetMapping("chooise/{data}")
    public String getProfiles(@PathVariable(name="data") String data){
        log.info(iChooise.message(data));
        return iChooise.message(data);
    }
}
