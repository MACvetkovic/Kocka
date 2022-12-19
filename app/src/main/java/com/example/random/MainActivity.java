package com.example.random;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button_roll);
        final TextView result1Text = findViewById(R.id.text_result1);
        final TextView result2Text = findViewById(R.id.text_result2);

        rollButton.setOnClickListener(v -> {

            int num1 = random.nextInt(6) + 1;
            int num2 = random.nextInt(6) + 1;


            result1Text.setText(String.valueOf(num1));
            result2Text.setText(String.valueOf(num2));


            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            int color = Color.rgb(red, green, blue);


            View view = findViewById(R.id.activity_main);
            view.setBackgroundColor(color);
        });
    }
}
