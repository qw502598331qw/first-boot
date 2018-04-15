package com.example.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${agan.msg}")
    private String msg;
    @RequestMapping("")
    public String index() {
        int no=1/0;
        return this.msg;
    }
}
