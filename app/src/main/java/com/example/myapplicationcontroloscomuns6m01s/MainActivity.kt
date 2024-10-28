package com.example.myapplicationcontroloscomuns6m01s

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this, "Welcome to the app! ", Toast.LENGTH_SHORT).show()
    }
//Eventos para clique no botão e alteração do texto dos Botões
    fun Button1Click(view: View)
    {
        var edit1 = findViewById<EditText>(R.id.nome_school)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        //Altera o textView do default para o texto do edit1
        findViewById<TextView>(R.id.Hello).setText(edit1.text)
    }
    fun Button2Click(view: View)
    {
        var edit1 = findViewById<EditText>(R.id.nome)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        //Altera o textView do default para o texto do edit1
        findViewById<TextView>(R.id.HelloWorld).setText(edit1.text)

    }
    fun Button3Click(view: View)
    {
        var edit1 = findViewById<EditText>(R.id.anos)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        //Altera o textView do default para o texto do edit1
        findViewById<TextView>(R.id.IPVCname).setText(edit1.text)

    }
    fun Button4Click(view: View)
    {
        var edit1 = findViewById<EditText>(R.id.numero)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        //Altera o textView do default para o texto do edit1
        findViewById<TextView>(R.id.ESTGname).setText(edit1.text)

    }

// Eventos para clique no botão e  Opening a new intent on button click activity new activity
    fun ClickSecond(view: View)
    {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(MainActivity.PARAM_NAME,
        findViewById<EditText>(R.id.nome_school).text.toString())

        startActivity(intent)

    }


    fun ClickThird(view: View)
    {
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra(MainActivity.PARAM_NAME1,
        findViewById<EditText>(R.id.nome_school).text.toString())

        startActivity(intent)
    }


    fun ClickFourth(view: View)
    {
        val intent = Intent(this, MainActivity4::class.java)
        intent.putExtra(MainActivity.PARAM_NAME2,
        findViewById<EditText>(R.id.nome_school).text.toString())

        startActivity(intent)
    }
    //Compain Object
    companion object
    {
        const val PARAM_NAME = "name"
        const val PARAM_NAME1 = "name1"
        const val PARAM_NAME2 = "name2"
    }

}