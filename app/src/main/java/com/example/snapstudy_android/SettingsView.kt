package com.example.snapstudy_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SettingsView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_view)
        val actionSBar = supportActionBar

        actionSBar!!.title = "Settings"

        actionSBar.setDisplayHomeAsUpEnabled(true)
    }
}