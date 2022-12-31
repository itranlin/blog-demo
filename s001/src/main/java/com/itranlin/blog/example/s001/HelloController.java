package com.itranlin.blog.example.s001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : itranlin
 * @since : 2022/12/31 20:06
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world, I'm itranlin";
    }
}
