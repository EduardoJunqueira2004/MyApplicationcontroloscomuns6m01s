package com.example.myapplicationcontroloscomuns6m01s

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Ir ao itent e buscar o prâmetro que passamos de uma mensagem neste caso o nome
        val message2 = intent.getStringExtra(MainActivity.PARAM_NAME1)
        //Alterar o texto do textView para a mensagem que passamos o text
        val textView = findViewById<TextView>(R.id.Activity3).apply {
            text = message2
    }


    }

}