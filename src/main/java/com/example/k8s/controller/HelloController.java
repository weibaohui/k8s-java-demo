package com.example.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibh
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{world}")
    public String hello(@PathVariable String world) {
        return String.format("hello %s", world);
    }
}
