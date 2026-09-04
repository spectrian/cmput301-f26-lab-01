package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun speak(): String {
        return "Sad!"
    }
}