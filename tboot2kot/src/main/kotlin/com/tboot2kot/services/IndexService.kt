package com.tboot2kot.services

import com.tboot2kot.entity.User

interface IndexService {
    fun findAllUsers(): List<User>
}