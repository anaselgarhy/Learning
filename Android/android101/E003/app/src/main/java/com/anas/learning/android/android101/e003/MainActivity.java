package com.anas.learning.android.android101.e003;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    // A function that is called when the activity is created.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate() called");
    }

    @Override
    // A function that is called when the activity is started.
    protected void onStart() {
        super.onStart();
        showToast("onStart function");
    }

    @Override
    // A function that is called when the activity is resumed.
    protected void onResume() {
        super.onResume();
        showToast("onResume function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy function");
    }

    private void showToast(final String message) {
        Toast.makeText(super.getBaseContext(), message, Toast.LENGTH_SHORT).show();
    }
}