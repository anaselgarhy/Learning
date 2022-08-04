package com.anas.learning.android.android101.e002;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Hello :D", Toast.LENGTH_SHORT).show();

        // Getting the button from the layout and assigning it to a variable.
        Button button1 = findViewById(R.id.buttonOne);

        button1.setText("Hello World");

        button1.setOnClickListener(new MyListener());
    }

    private class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast t =Toast.makeText(getBaseContext(), "Hi", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}