package com.deepdweller.switch_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Продолжение
        val continue_game = findViewById<Button>(R.id.button_continue)
        continue_game.setOnClickListener{
        val perehod = Intent(this,Continue::class.java)
            startActivity(perehod)
        }

        //Переход в новую игру
        val new_game = findViewById<Button>(R.id.button_newgame)
        new_game.setOnClickListener{
            val perehod = Intent(this,NewGame_Activity::class.java)
            startActivity(perehod)
        }
        //Загрузка
        val load_game = findViewById<Button>(R.id.button_load)
        load_game.setOnClickListener{
            val perehod = Intent(this,LoadGame_Activity::class.java)
            startActivity(perehod)
        }

        //Настройки
        val options_screen = findViewById<Button>(R.id.button_options)
        options_screen.setOnClickListener{
            val perehod = Intent(this,OptionsScreen_Activity::class.java)
            startActivity(perehod)
        }
        //Выход
        val exit_game = findViewById<Button>(R.id.button_exit)
        exit_game.setOnClickListener{
            val perehod = Intent(this,ExitGame::class.java)
            startActivity(perehod)
        }



    }



}