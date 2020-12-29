package com.deepdweller.switch_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val exit = findViewById<Button>(R.id.button_exit)

        exit.setOnClickListener{
            val perehod = Intent(this,MainActivity::class.java)
            startActivity(perehod)
        }


    }
}