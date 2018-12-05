package com.tspringmvc2.controller;

import com.tspringmvc2.entity.User;
import com.tspringmvc2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/new")
public class NewUserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String newUser(Model model) {
        model.addAttribute(new User());
        return "new";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/new";
        }
        userService.addUser(user);
        return "redirect:/";
    }
}
