package com.sup.administrator.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
String usr,pass,getuser,getpass1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        b=(Button)findViewById(R.id.logout);
//        SharedPreferences s =getSharedPreferences("login",MODE_PRIVATE);
//        getuser=s.getString("username",null);
//
//            if(getuser1==null)
//            {
//                Intent p=new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(p);
//        }


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor e=getSharedPreferences("login",MODE_PRIVATE).edit();
                e.clear();
                e.apply();
                Intent m = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(m);



            }
        });
        SharedPreferences o=getSharedPreferences("login",MODE_PRIVATE);
        getuser=o.getString("username",null);
        getpass1=o.getString("password",null);
        Toast.makeText(getApplicationContext(),getuser,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getpass1,Toast.LENGTH_LONG).show();



//
//        Intent x=getIntent();
//        usr=x.getExtras().getString("username");
//        pass=x.getExtras().getString("password");
//        Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
    }
}
