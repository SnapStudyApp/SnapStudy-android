package com.example.snapstudy_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCamera: Button = findViewById(R.id.btCamera)
        btCamera.setOnClickListener{
            val intentC = Intent(this,CameraView::class.java)
            startActivity(intentC)
        }

        val btSettings: Button = findViewById((R.id.btSettings))

        btSettings.setOnClickListener{
            val intentS = Intent(this,SettingsView::class.java)
            startActivity(intentS)
        }
    }
}