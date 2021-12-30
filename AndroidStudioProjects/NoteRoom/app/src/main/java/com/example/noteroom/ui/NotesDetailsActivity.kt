package com.example.noteroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.noteroom.R
import com.example.noteroom.db.Note
import com.example.noteroom.db.NoteDao
import com.example.noteroom.db.NoteDatabase
import kotlinx.android.synthetic.main.activity_note_details.*

class NotesDetailsActivity : AppCompatActivity() {

    var note: Note? = null
    private lateinit var noteDAO: NoteDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_details)
        getNoteIfExist()
        initSaveAction()
        noteDAO = NoteDatabase.getInstance(this).getNoteDao()
    }

    private fun getNoteIfExist() {
        note = intent.getSerializableExtra("note") as Note?
        noteTitle.setText(note?.title)
        noteDescription.setText(note?.description)
    }

    private fun initSaveAction() {
        saveNote.setOnClickListener {
            if (noteTitle.text.isNotEmpty() && noteDescription.text.isNotEmpty())
                handleSaveAction()
            else
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
        }
    }

    private fun handleSaveAction() {
        if (note != null)
            updateNote()
        else
            insertNote()
        finish()
    }

    private fun updateNote() {
        note!!.title = noteTitle.text.toString()
        note!!.description = noteDescription.text.toString()
        noteDAO.update(note!!)
    }

    private fun insertNote() {
        val newNote = Note(noteTitle.text.toString(), noteDescription.text.toString())
        noteDAO.addNote(newNote)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.delete -> {
                note?.let { noteDAO.deletNote(it) }
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}