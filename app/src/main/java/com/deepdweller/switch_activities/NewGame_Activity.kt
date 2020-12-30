package com.deepdweller.switch_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewGame_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newgame)

        val exit = findViewById<Button>(R.id.button_back)

        exit.setOnClickListener{
            val perehod = Intent(this,MainActivity::class.java)
            startActivity(perehod)
        }


    }
}