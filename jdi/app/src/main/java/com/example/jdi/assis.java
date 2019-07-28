package com.example.jdi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class assis extends AppCompatActivity {
    Button a=null,b=null,c=null,d=null,e=null,f=null;
    Intent impli=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assis);
        a=findViewById(R.id.aryain);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
        b=findViewById(R.id.jhon);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
        c= findViewById(R.id.ramsy);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
        d=findViewById(R.id.eliza);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
        e=findViewById(R.id.hems);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
        f=findViewById(R.id.scar);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                impli=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9949033926"));
                startActivity(impli);
            }
        });
    }
}
