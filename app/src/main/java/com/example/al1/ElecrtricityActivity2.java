package com.example.al1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElecrtricityActivity2 extends AppCompatActivity {
private Button s_past , s_pred , s_check ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecrtricity2);
        s_past=findViewById(R.id.sPastE);
        s_pred=findViewById(R.id.spredE);
        s_check=findViewById(R.id.checkE);
s_past.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(ElecrtricityActivity2.this,ShowPastElectroicActivity2.class);
        startActivity(intent);
    }
});

        s_pred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ElecrtricityActivity2.this,ShowPredectionElectrecity2.class);
                startActivity(intent);
            }
        });
        s_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ElecrtricityActivity2.this,CheckWaterIndviActivity2.class);
                startActivity(intent);
            }
        });
    }
}