package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @PostMapping(value = "/e/t1")
    public String test1(Model model, String name) {
        model.addAttribute("msg", name);
        return "test";
    }
}
