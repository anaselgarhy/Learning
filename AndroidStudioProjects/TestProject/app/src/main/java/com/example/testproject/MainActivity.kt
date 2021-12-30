package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){

            val button1 =findViewById<Button>(R.id.button1)
            button1.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.frameId, Fragment1()).commitNow()
            }
            val button2 =findViewById<Button>(R.id.button2)
            button1.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.frameId, Fragment2()).commitNow()
            }


        }
    }
}