package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class studentController {

    private final studentService Services;

    @Autowired
    public studentController(studentService p_Services) {
        this.Services = p_Services;
    }

    @GetMapping("/")
    public String Showhomepage() {
        return "index";
    }

    @GetMapping("/signup")
    public String Showsignuppage(Model model) {
        model.addAttribute("student", new student());
        return "signup";
    }

    @PostMapping("/signup")
    public String Registration(@ModelAttribute student mainEntity,Model model) {
        Services.registerStudent(mainEntity);
        model.addAttribute("name",mainEntity.getName());
        return "welcome";

    }

    String name = "Damilare";
    String username = "stitch2005";




}
