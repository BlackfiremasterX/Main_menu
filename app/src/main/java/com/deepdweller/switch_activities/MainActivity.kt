package com.deepdweller.switch_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val continue_game = findViewById<Button>(R.id.button_continue)

        continue_game.setOnClickListener{
        val perehod = Intent(this,Activity_1::class.java)
            startActivity(perehod)
        }

        val new_game = findViewById<Button>(R.id.button_newgame)

        new_game.setOnClickListener{
            val perehod = Intent(this,Activity_2::class.java)
            startActivity(perehod)
        }


    }



}