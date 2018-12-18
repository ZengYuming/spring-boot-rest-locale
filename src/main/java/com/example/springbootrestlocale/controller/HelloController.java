package com.example.springbootrestlocale.controller;

import com.example.springbootrestlocale.config.Translator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping
    public String getMessage(String msg) {
        return Translator.toLocale(msg);
    }
}
