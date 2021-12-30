package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Data
        val users = ArrayList<data>()
        users.add(data("Anas", 18, R.drawable.iconhuman))
        users.add(data("Ahmed", 20, R.drawable.ic_launcher_background))
        users.add(data("Hosny", 35, R.drawable.iconhuman))
        users.add(data("Mohmed", 12, R.drawable.ic_launcher_background))
        users.add(data("Ream", 9, R.drawable.iconhuman))
        users.add(data("Abd Allh", 23, R.drawable.ic_launcher_background))
        users.add(data("Yosef", 17, R.drawable.iconhuman))
        users.add(data("Khaled", 26, R.drawable.ic_launcher_background))
        users.add(data("Anas", 16, R.drawable.iconhuman))
        users.add(data("Mahmod", 21, R.drawable.ic_launcher_background))
        users.add(data("Anas", 18, R.drawable.iconhuman))
        users.add(data("Ahmed", 20, R.drawable.ic_launcher_background))
        users.add(data("Hosny", 35, R.drawable.iconhuman))
        users.add(data("Mohmed", 12, R.drawable.ic_launcher_background))
        users.add(data("Ream", 9, R.drawable.iconhuman))
        users.add(data("Abd Allh", 23, R.drawable.ic_launcher_background))
        users.add(data("Yosef", 17, R.drawable.iconhuman))
        users.add(data("Khaled", 26, R.drawable.ic_launcher_background))
        users.add(data("Anas", 16, R.drawable.iconhuman))
        users.add(data("Mahmod", 21, R.drawable.ic_launcher_background))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = MyAdapter(users)

        recyclerView.adapter = adapter

    }
}