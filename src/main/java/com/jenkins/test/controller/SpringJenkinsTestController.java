package com.jenkins.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Irshad Hameed
 */

@RestController
@RequestMapping("/jenkins")
public class SpringJenkinsTestController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Jenkins Test Application is running successfully!";
    }
}
