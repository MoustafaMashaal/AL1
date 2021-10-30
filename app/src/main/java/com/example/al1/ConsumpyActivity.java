package com.example.al1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsumpyActivity extends AppCompatActivity {

    Button individual , company , factor ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumpy);

        individual = findViewById(R.id.individual_id);
        company = findViewById(R.id.company_id);
        factor = findViewById(R.id.factor_id);

        individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConsumpyActivity.this , MainActivity.class);
                startActivity(intent);

            }
        });
        factor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConsumpyActivity.this , MainActivity.class);
                startActivity(intent);

            }
        });

        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConsumpyActivity.this , CompanyActivity.class);
                startActivity(intent);

            }
        });



    }
}