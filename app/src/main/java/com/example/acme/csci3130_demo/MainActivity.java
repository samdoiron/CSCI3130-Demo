package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText theEditText = (EditText)findViewById(R.id.theEditText);
        TextView theLabel = (TextView)findViewById(R.id.theLabel);
        Button theButton = (Button)findViewById(R.id.theButton);

        theButton.setOnClickListener((_e) -> {
            theLabel.setText(theEditText.getText());
        });
    }
}
