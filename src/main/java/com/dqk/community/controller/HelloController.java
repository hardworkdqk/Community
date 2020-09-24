package com.dqk.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Program:community
 * @description:
 * @author:
 * @create-time:2020-09-24 21:58
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name",required = false,defaultValue = "World")
                                    String name , Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "hello";
    }
}
