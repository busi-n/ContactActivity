package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName="Khulisani"
        val lastName="Msipa"
        var address="63 Cone cres Goodwood "
        var isMale=false
        val dayOfBirth=15
        val monthOfBirth="September"
        val yearOfBirth=2006
        Log.d( "Hi",firstName +" "+lastName+ "you live in"+ address + "it is"+ isMale+"that you are male"+dayOfBirth+" "+
        monthOfBirth+" "+yearOfBirth)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}