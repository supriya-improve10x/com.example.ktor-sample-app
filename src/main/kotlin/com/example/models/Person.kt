package com.example.models

import kotlinx.serialization.Serializable

@Serializable

class Person (val id: String, val firstName:String, val lastName: String, val email: String){

}