package com.example.testproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_card_view.view.*

class MyAdapter(var users: ArrayList<data>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent : ViewGroup, p1 :Int) :ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_card_view,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data :data = users[position]
        holder.text_name.text = data.name
        holder.text_age.text = data.age.toString()
        holder.my_imge.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
        return users.size
    }
    
    
    
    
    
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val text_name = itemView.nameView as TextView
        val text_age = itemView.ageView as TextView
        val my_imge = itemView.imageView as ImageView
    }



}


















