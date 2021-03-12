package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
//@ResponseBody + @Controller = @RestController
@RestController
public class IndexController {
    
    @RequestMapping("index")
    public String index() {
        //
        // test
        return "hello!??????????????!!!";
    }
    
}
