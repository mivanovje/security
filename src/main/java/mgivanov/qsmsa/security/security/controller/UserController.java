package mgivanov.qsmsa.security.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/index.html")
    public String getIndex() {
        return "index";
    }
}
