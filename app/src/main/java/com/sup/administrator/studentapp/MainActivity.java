package com.sup.administrator.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText e1,e2;
    Button b,b1,b4;
    String s1,s2;
    String stid="mzc";
    String pass="college";
    String checkusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences a=getSharedPreferences("login",MODE_PRIVATE);
        checkusername=a.getString("username",null);
        if(checkusername!=null)
        {
            Intent i =new Intent(getApplicationContext(),Welcome.class);
            startActivity(i);
        }
        b4=(Button)findViewById(R.id.viewusers);


        e1=(EditText)findViewById(R.id.id);
        e2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.login);
        b1=(Button)findViewById(R.id.reg);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(getApplicationContext(),userlist.class);
                startActivity(k);
            }
        });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i= new Intent(getApplicationContext(),RegisterActivity.class);
               startActivity(i);
           }
       });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals(stid) && (s2.equals(pass)))
                {
                    SharedPreferences.Editor ed=getSharedPreferences("login",MODE_PRIVATE).edit();
                    ed.putString("username",s1);
                    ed.putString("password",s2);
                    ed.apply();
//                    ed.commit();
                    Intent a=new Intent(getApplicationContext(),Welcome.class);
                    a.putExtra("username",s1);
                    a.putExtra("password",s2);
                    startActivity(a);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrect Password or id",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
