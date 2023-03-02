package org.example.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainPageController {

    @GetMapping("/")
    public String sayHello(ModelMap modelMap) {
        return "Hello! This is main test controller!";
    }

    @GetMapping("/all")
    public String forAll() {
        return "This is common page!";
    }

    @GetMapping("/authorized")
    public String forAuthorized() {
        return "This is page only for authorized users!";
    }

    @GetMapping("/admin")
    public String forAdmins() {
        return "This is page only for admin!";
    }

}
