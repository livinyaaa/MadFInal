package com.example.madfinal.data

data class User(
    val email: String,
    var imagePath: String =""
){
    constructor(): this ("","")

}
