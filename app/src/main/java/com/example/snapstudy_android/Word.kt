package com.example.snapstudy_android

var wordList = mutableListOf<Word>()
class Word (
    val prompt: String,
    val answer: String,
    val id: Int? = wordList.size
)