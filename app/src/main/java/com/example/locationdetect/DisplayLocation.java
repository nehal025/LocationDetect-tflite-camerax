package com.example.locationdetect;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayLocation extends AppCompatActivity {

    TextView mLocation,mConfidence;
    String location,confidence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_location);

        mLocation=findViewById(R.id.location);
        mConfidence=findViewById(R.id.des);

        location= getIntent().getExtras().getString("location");
        confidence= getIntent().getExtras().getString("confidence");

        mLocation.setText(location);
        mConfidence.setText(confidence);

    }
}