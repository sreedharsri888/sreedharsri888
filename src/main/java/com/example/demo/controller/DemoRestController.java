package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/controller")
public class DemoRestController {

    @GetMapping("/response")
    public String getResponse() {
        return "Response from API controller";

    }
}
