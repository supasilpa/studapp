package com.sup.administrator.studentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewall extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewall);
        lv=(ListView)findViewById(R.id.listview);
        String[] students={"supa","misha","aleena"};
        ArrayAdapter adptr=new ArrayAdapter(getApplicationContext(),R.layout.activity_list_item_view,students);
        lv.setAdapter(adptr);
    }
}
