package com.tboot1.controller;

import com.tboot1.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/", name = "Index")
public class IndexController {

  @GetMapping
  public Map<Integer, User> findAll() {
    return new HashMap<Integer, User>() {
      {
        initHasMapObject();
      }

      void initHasMapObject() {
        put(1, new User(1, "Simon", 24));
        put(2, new User(2, "Vlad", 23));
      }
    };
  }
}
