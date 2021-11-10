package com.chris.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Distances extends AppCompatActivity {

    Button convertButton;
    TextInputEditText milesInput;
    TextView displayKms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distances);

        convertButton = findViewById(R.id.button);
        milesInput = findViewById(R.id.miles);
        displayKms = findViewById(R.id.kms);



        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float miles = Float.parseFloat(milesInput.getText().toString().trim());
                float result = (float) (miles * 1.60934);
                displayKms.setText("RESULT: "+ result + "kms");
            }
        });

    }
}