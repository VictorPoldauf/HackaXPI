package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main11.*
import kotlinx.android.synthetic.main.activity_main12.*

class Main12Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        btn16.setOnClickListener {
            val intentMain = Intent(this, Main13Activity::class.java)
            startActivity(intentMain)
        }
    }
}