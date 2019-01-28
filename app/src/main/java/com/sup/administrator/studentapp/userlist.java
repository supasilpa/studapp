package com.sup.administrator.studentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class userlist extends AppCompatActivity {
TextView t;
    String getname,username,email,phone,address,web,street;
    String suite,city,zipcode,finaldata="";
    String url="https://jsonplaceholder.typicode.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);

        t=(TextView)findViewById(R.id.tv);
        FetchData();


    }

    private void FetchData() {
//        Toast.makeText(getApplicationContext(),"function",Toast.LENGTH_LONG).show();
        StringRequest sr=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        handle response
                        Log.d("response",response);
                        try{
                            JSONArray js=new JSONArray(response);
                            for(int i=0;i<js.length();i++)
                            {
                                JSONObject jsobj=js.getJSONObject(i);
                                getname=jsobj.getString("name");
                                Log.d("name",getname);
                                username=jsobj.getString("username");
                                Log.d("username",username);
                                email=jsobj.getString("email");
                                Log.d("email",email);
                                JSONObject address=new JSONObject(jsobj.getString("address"));
                                street=address.getString("street");
                                suite=address.getString("suite");
                                city=address.getString("city");
                                zipcode=address.getString("zipcode");
                                Log.d("street",street);
                                phone=jsobj.getString("phone");
                                Log.d("phone",phone);
                                web=jsobj.getString("website");
                                Log.d("web",web);
                                finaldata += "Name:" + getname + "\n";
                                finaldata += "Email:" + email + "\n\n\n";


                        }
                          t.setText(finaldata);

                    }
                        catch(JSONException obj)
                        {
                            Log.d("Exception",obj.toString());
                        }
                    }},
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
//                        handle error

                    }
                }
        );
        RequestQueue rq= Volley.newRequestQueue(this);
        rq.add(sr);
    }
}
