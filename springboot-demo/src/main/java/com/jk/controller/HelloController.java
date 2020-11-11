package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHi")
    public String sayHi(String name) {
        return "欢迎：" + name;
    }
}
