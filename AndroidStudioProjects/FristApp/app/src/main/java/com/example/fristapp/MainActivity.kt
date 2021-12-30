package com.example.fristapp

import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var year = Calendar.getInstance().get(Calendar.YEAR)
        var v :Int = 2021 - he_age.text
            cal.setOnClickListener {

                println("$year")
                val intent=Intent(this,MainActivity2::class.java)
             intent.putExtra("age",he_age.text.toString())
             startActivity(intent)
         }
    }
}
