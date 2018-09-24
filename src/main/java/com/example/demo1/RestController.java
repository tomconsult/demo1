package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jtomasov
 * @since 9/24/2018
 **/
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String index() {
        return "Hello From Jenkins X";
    }
}
