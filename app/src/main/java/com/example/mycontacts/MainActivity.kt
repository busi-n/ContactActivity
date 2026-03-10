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
        val currentYear=2026 //Based on the current date
        val age= currentYear- yearOfBirth

        //1. Calculate years until 100
        val yearsUntil100=100-age

        //2.Age in months
        val ageInMonths= age*12

        //3.Age in days (excluding leap years)
        val ageInDays=age*365

        //4. Reminder when divided by 5
        val ageReminder=age%5

     // Printing the calculated values to Logcat
        Log.d("Calculation"," Years until 100: $yearsUntil100")
        Log.d("Calculation"," Age in months: $ageInMonths")
        Log.d("Calculation"," Age in days: $ageInDays")
        Log.d("Calculation"," Reminder when divided by 5: $ageReminder")

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