package com.ayaanqui.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    private void setCounterTextValue(int value) {
        TextView counterText = findViewById(R.id.counterText);
        counterText.setText(counter);
        counter = value;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;

        final Button decrementButton = findViewById(R.id.decrementButton);
        decrementButton.setOnClickListener(event -> {
            setCounterTextValue(counter - 1);
        });

        final Button incrementButton = findViewById(R.id.incrementButton);
        incrementButton.setOnClickListener(event -> setCounterTextValue(counter + 1));
    }
}