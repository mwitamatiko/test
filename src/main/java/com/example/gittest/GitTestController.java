package com.example.gittest;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitTestController {

    @GET("/")
    public String gitTest(){
        return "test git";
    }

}
