package com.example.Phase3_Practiceproject5.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "error"; // Return the name of your error view (e.g., "error.html" or "error.jsp")
    }

    public String getErrorPath() {
        return PATH;
    }
}
