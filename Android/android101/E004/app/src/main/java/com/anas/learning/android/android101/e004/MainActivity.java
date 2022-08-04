package com.anas.learning.android.android101.e004;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showButton = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);

        showButton.setOnClickListener(view -> {
            ((TextView) findViewById(R.id.textView))
                    .setText(editText.getText());
            Toast.makeText(super.getBaseContext(), "Hi", Toast.LENGTH_SHORT).show();
        });
    }
}