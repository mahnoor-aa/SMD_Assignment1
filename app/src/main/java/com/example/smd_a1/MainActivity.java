package com.example.smd_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnsubmit;
    Button btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
               finish();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });
        }


    public void init()
    {
        btnsubmit=findViewById(R.id.btnsubmit);
        btnexit=findViewById(R.id.btnexit);
    }

}