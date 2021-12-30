package com.example.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var myshared: SharedPreferences?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        myshared=getSharedPreferences("myshered",0)
        var editor:SharedPreferences.Editor=myshared!!.edit()
        editor.putString("name","merna medhat")
        editor.commit()
        var backend=getSharedPreferences("name",0)
    }
}