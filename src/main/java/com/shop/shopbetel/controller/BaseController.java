package com.shop.shopbetel.controller;

import com.shop.shopbetel.entity.User;
import com.shop.shopbetel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    public String index(Model model) {
        User user = repo.findById(1).orElse(null);
        if(user == null) {
            user = new User();
            user.setName("Connect fail database");
        }
        model.addAttribute("user", user);
        return "index";
    }
}
