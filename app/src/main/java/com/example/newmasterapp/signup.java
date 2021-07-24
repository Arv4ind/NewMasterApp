package com.example.newmasterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newmasterapp.Entity.Model;

public class signup extends AppCompatActivity {

    EditText name,mobile,email,pwd;
    Button btn_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        name=findViewById(R.id.name) ;
        mobile=findViewById(R.id.mob) ;

        email=findViewById(R.id.etemail) ;
        pwd=findViewById(R.id.pass) ;
        btn_signup=findViewById(R.id.signupbtn);


      btn_signup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              setdata();


          }
      });




    }

    private void setdata() {

        String name1=name.getText().toString();
        String mobile1=mobile.getText().toString();
        String email1=email.getText().toString();
        String pwd1 =pwd.getText().toString();


        Model model=new Model();

        model.setUsername(name1);
        model.setMobile(mobile1);
        model.setEamil(email1);
        model.setPass(pwd1);
        database.getdbConnection(getApplicationContext()).getdao().insertalldata(model);
        Toast.makeText(signup.this, "data saved", Toast.LENGTH_SHORT).show();

    }
}