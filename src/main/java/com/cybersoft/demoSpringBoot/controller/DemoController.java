package com.cybersoft.demoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller : Cho phep dinh nghia duong dan thuong la tra ra file html (giao dien)
 * @ResponseBody : Chi tra ra String
 * @RestController : @Controller + @ResponseBody Cho phep dinh nghia duong dan luon luon tra ra String
    /demo
    /demo/hello
    /demo/detail
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("")
    public String demo(){
        return "demo";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
}
