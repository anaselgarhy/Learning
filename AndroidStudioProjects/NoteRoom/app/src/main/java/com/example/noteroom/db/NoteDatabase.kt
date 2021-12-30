package com.example.noteroom.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Note::class],version = 1, exportSchema = false)
 abstract class NoteDatabase :RoomDatabase(){
     abstract  fun getNoteDao():NoteDao
     companion object{
         fun getInstance(context: Context)=
             Room.databaseBuilder(context.applicationContext,NoteDatabase::class.java,"note_database").
             allowMainThreadQueries().build()
     }

}