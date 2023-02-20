package com.example.chitchat

class Message {
    var message:String? = null
    var senderId:String? = null

    constructor(){}  //Firebase must need an empty constructor to work with

    constructor(message: String?,senderId:String?){
        this.message=message
        this.senderId=senderId
    }

}