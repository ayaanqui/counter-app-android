package com.ayaanqui.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    private synchronized void setCounterTextValue(int value) {
        TextView counterText = findViewById(R.id.counterText);
        counterText.setText(Integer.toString(counter));
        counter = value;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;

        final Button decrementButton = findViewById(R.id.decrementButton);
        decrementButton.setOnClickListener(e ->  setCounterTextValue(counter - 1));

        final Button incrementButton = findViewById(R.id.incrementButton);
        incrementButton.setOnClickListener(e -> setCounterTextValue(counter + 1));
    }
}