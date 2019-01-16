package com.sup.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
 EditText e1,e2,e3,e4,e5,e6,e7,e8;
    Button b1,b2;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.adno);
        e3=(EditText)findViewById(R.id.rollno);
        e4=(EditText)findViewById(R.id.colle);
        e5=(EditText)findViewById(R.id.place);
        e6=(EditText)findViewById(R.id.stid);
        e7=(EditText)findViewById(R.id.pass1);
        e8=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.r1);
        b2=(Button)findViewById(R.id.alr1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                s3 = e3.getText().toString();
                s4 = e4.getText().toString();
                s5 = e5.getText().toString();
                s6 = e6.getText().toString();
                s7 = e7.getText().toString();
                s8 = e8.getText().toString();
                if (s7.equals(s8)) {
                    Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s4, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s5, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s6, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s7, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), s8, Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Registration Failed", Toast.LENGTH_LONG).show();
                }
            }

            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(e);
            }
        });
    }
}
