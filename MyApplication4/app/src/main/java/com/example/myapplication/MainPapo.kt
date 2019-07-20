package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainPapo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_papo)

        Handler().postDelayed({
            val intentMain = Intent(this, Main5Activity::class.java)
            startActivity(intentMain)
        }, 3000)
    }
}
