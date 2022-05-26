package com.example.snapstudy_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CameraView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_view)

        val actionCBar = supportActionBar

        actionCBar!!.title = "Upload an Image"

        actionCBar.setDisplayHomeAsUpEnabled(true)
    }
}