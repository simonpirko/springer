package com.tspringmvc.controllers;

import com.tspringmvc.entity.User;
import com.tspringmvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(path = "/")
public class IndexController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    List<User> findAllUsers() {
        return userService.findAll();
    }

    @PostMapping(path = "/add")
    public void saveUser(@RequestBody User user, HttpServletResponse res) {
        userService.save(user);
        res.setStatus(HttpServletResponse.SC_OK);
    }

    @PostMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id, HttpServletResponse res) {
        userService.delete(id);
        res.setStatus(HttpServletResponse.SC_OK);
    }
}
