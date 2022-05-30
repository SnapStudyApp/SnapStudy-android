package com.example.snapstudy_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class StudyView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_view)
        val actionStBar = supportActionBar

        actionStBar!!.title = "Study"

        actionStBar.setDisplayHomeAsUpEnabled(true)
    }
}