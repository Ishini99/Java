package com.restapi.dynamiccontent.rest_api_dynamic_content;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String helloWorld(){
        return  "hello world";
    }
}
