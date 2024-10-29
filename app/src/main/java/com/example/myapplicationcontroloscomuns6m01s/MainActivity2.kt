package com.example.myapplicationcontroloscomuns6m01s

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Ir ao itent e buscar o prâmetro que passamos de uma mensagem neste caso o nome
        val message = intent.getStringExtra(MainActivity.PARAM_NAME)
        //Alterar o texto do textView para a mensagem que passamos o text
        val textView = findViewById<TextView>(R.id.Activity2).apply {
            text = message
        }
    }

}