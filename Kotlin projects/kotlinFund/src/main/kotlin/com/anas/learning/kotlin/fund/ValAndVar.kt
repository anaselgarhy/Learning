package com.anas.learning.kotlin.fund

fun main() {
    // val is immutable (read-only, constant) variable
    val name = "Anas"
//    name = "Ahmed" // error: val cannot be reassigned
    println(name)

    // var is mutable (read-write, variable)
    var age = 20
    age = 21
    println(age)
}