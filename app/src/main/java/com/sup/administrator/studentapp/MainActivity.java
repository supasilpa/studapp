package com.sup.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText e1,e2;
    Button b,b1;
    String s1,s2;
    String stid="mzc";
    String pass="college";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.id);
        e2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.login);
        b1=(Button)findViewById(R.id.reg);
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
                    Intent a=new Intent(getApplicationContext(),Welcome.class);
                    startActivity(a);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Incoorect Password or id",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
