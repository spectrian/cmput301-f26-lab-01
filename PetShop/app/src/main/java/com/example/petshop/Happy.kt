package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun speak(): String {
        return "Happy!"
    }
}