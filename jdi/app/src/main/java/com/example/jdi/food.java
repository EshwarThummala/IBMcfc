package com.example.jdi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class food extends AppCompatActivity {
    Intent impli=null;
    Button x =null;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        x=findViewById(R.id.foodcall);
       x.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
               startActivity(impli);
           }
       });
    }
}