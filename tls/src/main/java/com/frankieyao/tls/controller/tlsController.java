package com.frankieyao.tls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "tls")
public class tlsController {

    @GetMapping("/data")
    public Object getData() {
        return "Get data from tlsController.";
    }
}
