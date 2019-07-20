package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btn4.setOnClickListener {
            val intentMain = Intent(this, MainPapo::class.java)
            startActivity(intentMain)
        }
            btn99.setOnClickListener{
                val intentMain = Intent(this, MainErrado2::class.java)
                startActivity(intentMain)
        }
        btn5.setOnClickListener{
            val intentMain = Intent(this, MainErrado::class.java)
            startActivity(intentMain)
        }
        btn5.setOnClickListener{
            val intentMain = Intent(this, MainErrado::class.java)
            startActivity(intentMain)
        }
        btn6.setOnClickListener{
            val intentMain = Intent(this, MainErradoAp::class.java)
            startActivity(intentMain)
        }
    }
}
