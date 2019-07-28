package com.example.jdi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {
    Button food=null,med=null,assis=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        food=findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(v.getContext(),food.class);
                startActivity(j);
            }
        });
        med=findViewById(R.id.medi);
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(v.getContext(),Medical.class);
                startActivity(j);
            }
        });
        assis=findViewById(R.id.inassf);
        assis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(v.getContext(),assis.class);
                startActivity(j);
            }
        });
    }
}
