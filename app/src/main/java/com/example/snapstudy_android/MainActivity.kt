package com.example.snapstudy_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Button
import com.example.snapstudy_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateCards()

        val mainActivity = this
        binding.rvList.apply {
            layoutManager =  GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(flashcardList)
        }
        val btCamera: Button = findViewById(R.id.btCamera)
        btCamera.setOnClickListener{
            val intentC = Intent(this,CameraView::class.java)
            startActivity(intentC)
        }

        val btStudy: Button = findViewById(R.id.btStudy)
        btStudy.setOnClickListener {
            val intentSt = Intent(this, StudyView::class.java)
            startActivity(intentSt)
        }

        val btSettings: Button = findViewById((R.id.btSettings))

        btSettings.setOnClickListener{
            val intentS = Intent(this,SettingsView::class.java)
            startActivity(intentS)
        }
    }

    private fun populateCards(){
        val card1 = Flashcard(prompt = "Hello", answer = "こんにちは")
        val card2 = Flashcard(prompt = "Thank you", answer = "ありがとうございました")
        val card3 = Flashcard(prompt = "Sorry", answer = "ごめん")
        val card4 = Flashcard(prompt = "Goodbye", answer = "さようなら")
        val card5 = Flashcard(prompt = "Hungry", answer = "お腹がすいた")

        flashcardList.add(card1)
        flashcardList.add(card2)
        flashcardList.add(card3)
        flashcardList.add(card4)
        flashcardList.add(card5)

    }
}