package com.example.chitchat

class User {
    var name:String? = null
    var email:String? = null
    var uid:String? = null

    constructor(){} //Firebase must need an empty constructor to work with

    // now its time for making a normal constructor
    constructor(name:String?,email:String?,uid:String?){
        this.name=name
        this.email=email
        this.uid=uid
    }


}