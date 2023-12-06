package com.servion.ivrapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {
	
    @RequestMapping("/ivr/app/feature")
    public ModelAndView router(@RequestParam(defaultValue = "index") String page, ModelAndView model){
        System.out.println("Inside IVR page v7");
        System.out.println("User selected : " + page);
        model.setViewName(page);
        return model;
    }
    
}

