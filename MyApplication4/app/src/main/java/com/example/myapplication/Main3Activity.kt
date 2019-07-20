package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main12.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn2.setOnClickListener{
            val intentMain = Intent(this, Main4Activity::class.java)
            startActivity(intentMain)
        }
        btnerrado3.setOnClickListener{
            val intentMain = Intent(this, MainErrado::class.java)
            startActivity(intentMain)
        }
        btnerrado2.setOnClickListener{
            val intentMain = Intent(this, MainErrado2::class.java)
            startActivity(intentMain)

        }
        btnerrado.setOnClickListener{
            val intentMain = Intent(this, MainErrado2::class.java)
            startActivity(intentMain)

        }
        btnerrado4.setOnClickListener{
            val intentMain = Intent(this, MainErrado2::class.java)
            startActivity(intentMain)

        }
        btnerrado5.setOnClickListener{
            val intentMain = Intent(this, Main4Activity::class.java)
            startActivity(intentMain)

        }
    }
}
