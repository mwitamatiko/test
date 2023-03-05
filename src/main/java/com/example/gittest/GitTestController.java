package com.example.gittest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    public String gitTest(){
        return "test git";
    }

}
