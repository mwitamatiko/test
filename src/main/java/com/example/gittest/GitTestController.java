package com.example.gittest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitTestController {

    @GetMapping("/")
    public String gitTest(){
        return "test git";
    }

}
