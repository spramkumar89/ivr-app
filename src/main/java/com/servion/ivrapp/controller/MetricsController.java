package com.servion.ivrapp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

	@GetMapping("/ivr/metrics")
    public String metrics(){
		System.out.println("App Version : To check the rolling update");
        String str = "App Version : To check the rolling update";
        str = str + " : " + new Date();
        return str;
    }
}
