package com.example.al1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.anastr.speedviewlib.SpeedView;

public class CheckWaterIndviActivity2 extends AppCompatActivity {


    Button btnCheck;
    TextView textWarning,textNearRisk,Safe;
    EditText editWater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_water_indvi2);
        btnCheck=findViewById(R.id.check_water);

        textWarning = findViewById(R.id.warning);
        textNearRisk = findViewById(R.id.nearRisk);
        Safe = findViewById(R.id.safe);

        editWater=findViewById(R.id.water_percentage);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           textNearRisk.setVisibility(View.GONE);
           textWarning.setVisibility(View.GONE);
           Safe.setVisibility(View.GONE);
           int value=Integer.parseInt(editWater.getText().toString());
           if(value>0&&value<=5){
              Safe.setVisibility(View.VISIBLE);
           }else if(value>5&&value<=15){
            textNearRisk.setVisibility(View.VISIBLE);
           }else{
              textWarning.setVisibility(View.VISIBLE);
           }
            }
        });
    }
}