package com.example.moviesnerds.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.R;
import com.example.moviesnerds.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView movieName;
    Button getMovieButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieName = findViewById(R.id.textView);
        getMovieButton = findViewById(R.id.button);
        getMovieButton.setOnClickListener(this);
    }
    public MovieModel getMovieFromDatabase(){
        return new MovieModel("Cast Away", "26/03/2003", "Very sad movie", 1);
    }

    public void getMovie() {
        movieName.setText(getMovieFromDatabase().getName());
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            getMovie();
        }
    }
}