package com.zc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AjaxController {

    @RequestMapping(value = "/t1")
    public String test() {
        return "hello";
    }

    @GetMapping(value = "/a1")
    public void a1(String name, Model model, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if("zc".equals(name)) {
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }
}
