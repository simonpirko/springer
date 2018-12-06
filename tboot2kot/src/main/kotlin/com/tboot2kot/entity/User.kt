package com.tboot2kot.entity

open class User(var id: Int, var name: String, var age: Int) {
    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age)"
    }
}

