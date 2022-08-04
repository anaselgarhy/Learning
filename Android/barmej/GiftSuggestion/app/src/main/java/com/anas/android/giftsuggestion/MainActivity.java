package com.anas.android.giftsuggestion;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.anas.learning.android.android101.giftsuggestion.R;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private int[] giftImages;
    private byte currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giftImages = new int[]{
                R.drawable.gift_1,
                R.drawable.gift_2,
                R.drawable.gift_3,
                R.drawable.gift_4,
                R.drawable.gift_5,
                R.drawable.gift_6,
                R.drawable.gift_7,
                R.drawable.gift_8,
                R.drawable.gift_9,
                R.drawable.gift_10
        };
        currentIndex = -1;

        findViewById(R.id.button_suggest).setOnClickListener(v -> {
            currentIndex = (byte)  (Math.random() * giftImages.length);
            updateImage();
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putByte("currentIndex", currentIndex);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        currentIndex = savedInstanceState.getByte("currentIndex");
        if (currentIndex != -1) {
            updateImage();
        }
    }

    private void updateImage() {
        ((ImageView) findViewById(R.id.image_gift))
                .setImageDrawable(ContextCompat.getDrawable(this,
                giftImages[currentIndex]));
    }
}