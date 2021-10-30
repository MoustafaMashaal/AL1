package com.example.al1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WaterSecectionActivity2 extends AppCompatActivity {

    Button s_past , s_pred , s_check ;
    EditText checksUser ;
    String value_cheks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_secection2);

        s_check = findViewById(R.id.check);
        s_pred=findViewById(R.id.spred);
        checksUser = findViewById(R.id.user_edit_text_check);
        s_past=findViewById(R.id.sPast);
        s_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WaterSecectionActivity2.this,CheckWaterIndviActivity2.class);
                startActivity(intent);
            }
        });
        s_past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WaterSecectionActivity2.this,ShowPastWaterActivity2.class);
                startActivity(intent);
            }
        });
        s_pred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WaterSecectionActivity2.this,SPredectionWaterActivity2.class);
                startActivity(intent);
            }
        });


    }
}