package com.maryanto.dimas.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/secured")
public class ExampleSecureController {


    @GetMapping("/object")
    public Map<String, Object> showProp(Principal principal) {
        Map<String, Object> params = new HashMap<>();
        params.put("currentTime", new Date());
        params.put("currentUser", principal.getName());
        return params;
    }
}
