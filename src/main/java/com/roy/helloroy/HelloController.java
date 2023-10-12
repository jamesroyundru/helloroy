package com.roy.helloroy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/roy")
    public String Hello()
    {
        return "Hello Roy";
    }
    
}
