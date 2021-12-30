package com.example.noteroom.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noteroom.R
import com.example.noteroom.db.NoteDao
import com.example.noteroom.db.NoteDatabase
import kotlinx.android.synthetic.main.activity_notes.*

class NoteActivity : AppCompatActivity() {
    private lateinit var noteDAO: NoteDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        noteDAO = NoteDatabase.getInstance(this).getNoteDao()
        addNote.setOnClickListener {
            startActivity(Intent(this, NotesDetailsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        notesRecycler.adapter = NotesAdapter(noteDAO.getAllNote())
    }
    }
