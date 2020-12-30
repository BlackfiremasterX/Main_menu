package com.deepdweller.switch_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OptionsScreen_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_screen_)
        //В главное меню
        val back_to_menu = findViewById<Button>(R.id.button_back)
        back_to_menu.setOnClickListener{
            val perehod = Intent(this,MainActivity::class.java)
            startActivity(perehod)
        }
    }
}