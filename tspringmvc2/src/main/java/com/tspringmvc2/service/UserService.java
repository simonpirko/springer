package com.tspringmvc2.service;

import com.tspringmvc2.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> users = new HashMap<>();
    private int index;

    public void addUser(User user) {
        users.put(index, user);
        index++;
    }

    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            usersList.add(users.get(i));
        }
        return usersList;
    }
}
