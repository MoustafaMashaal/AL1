package com.example.al1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackActivity extends AppCompatActivity {
Button btnWater,btnElect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
        btnWater=findViewById(R.id.water);
        btnElect=findViewById(R.id.Elect);
        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrackActivity.this,WaterSecectionActivity2.class);
                startActivity(intent);
            }
        });
        btnElect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrackActivity.this,ElecrtricityActivity2.class);
                startActivity(intent);


            }
        });
    }
}