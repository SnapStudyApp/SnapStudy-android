package com.example.snapstudy_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.snapstudy_android.fragments.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_dashboard.*
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

    //Fragment values
    private val dashboardFragment = DashboardFragment()
    private val cameraFragment = CameraFragment()
    private val studyFragment = StudyFragment()
    private val settingsFragment = SettingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragments(dashboardFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_dashboard -> replaceFragments(dashboardFragment)
                R.id.ic_camera -> replaceFragments(cameraFragment)
                R.id.ic_study -> replaceFragments(studyFragment)
                R.id.ic_settings -> replaceFragments(settingsFragment)
            }
            true
        }
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        populateCards()
//
//        val mainActivity = this
//        binding.rvList.apply {
//            layoutManager =  GridLayoutManager(applicationContext, 2)
//            adapter = CardAdapter(flashcardList)
//        }

    }

    //function to change fragments
    private fun replaceFragments(fragment: Fragment){
        //checking if fragment is null
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()

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