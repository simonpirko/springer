package com.tboot2kot.services

import com.tboot2kot.entity.User
import org.springframework.stereotype.Service

@Service
class IndexServiceImpl : IndexService {
    override fun findAllUsers(): List<User> {
        val userList = ArrayList<User>()
        userList.add(User(1, "Simon", 24))
        userList.add(User(2, "Vlad", 23))
//        userList.add(User(3, "23", 23))
//        userList.add(User(4, "23", 23))
        return userList
    }
}