package com.example.snapstudy_android

var flashcardList = mutableListOf<Flashcard>()
class Flashcard(
    var prompt: String,
    var answer: String,
    val id: Int? = flashcardList.size
)



