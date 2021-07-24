package com.example.newmasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



TextView reg;
    EditText userid,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


reg=findViewById(R.id.tv_reg);
        userid =findViewById(R.id.userid);
        pass =findViewById(R.id.pass);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arvind=new Intent(MainActivity.this,signup.class);
                startActivity(arvind);
            }
        });


    }

    public void login(View view) {



    }



}