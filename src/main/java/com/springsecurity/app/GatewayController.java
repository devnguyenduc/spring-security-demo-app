package com.springsecurity.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
    @RequestMapping(value = "", method= RequestMethod.GET)
    public String gateway(){
        return "hello";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String admin(){
        return "hello admin";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String user(){
        return "hello user";
    }
}
