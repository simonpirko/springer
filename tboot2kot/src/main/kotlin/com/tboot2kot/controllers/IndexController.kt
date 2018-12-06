package com.tboot2kot.controllers

import com.tboot2kot.entity.User
import com.tboot2kot.services.IndexServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/"])
class IndexControllers(@Autowired private var indexServiceImpl: IndexServiceImpl,
                       @Autowired private var httpHeaders: HttpHeaders) {

    @GetMapping
    fun findAll(): ResponseEntity<List<User>> {
        httpHeaders.add("Access-Control-Allow-Origin", "*")
        return ResponseEntity(indexServiceImpl.findAllUsers(), httpHeaders, HttpStatus.CREATED)
    }
}