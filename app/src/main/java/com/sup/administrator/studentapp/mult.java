package com.sup.administrator.studentapp;

import android.opengl.EGLSurface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mult extends AppCompatActivity {
EditText e1,e2,e3;
    Button b;
    Integer n1,n2,n3;
    String s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult);

        e1=(EditText)findViewById(R.id.m1);
        e2=(EditText)findViewById(R.id.m2);
        e3=(EditText)findViewById(R.id.m4);
        b=(Button) findViewById(R.id.m3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=n1*n2;
                s3=String.valueOf(n3);
                e3.setText(s3);
                e3.setVisibility(View.VISIBLE);


            }
        });

    }
}
