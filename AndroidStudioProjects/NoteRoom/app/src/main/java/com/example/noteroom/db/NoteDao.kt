package com.example.noteroom.db

import androidx.room.*

@Dao
interface NoteDao {
    @Insert
    fun addNote(note: Note)
    @Query("SELECT *From note")
    fun getAllNote():List<Note>
    @Update
    fun update(note: Note)
    @Delete
    fun deletNote(note: Note)
}