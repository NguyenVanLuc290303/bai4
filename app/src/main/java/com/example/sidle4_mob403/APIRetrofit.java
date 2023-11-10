package com.example.sidle4_mob403;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class APIRetrofit extends AppCompatActivity {

    public  static final String NameServer = "http://10.24.33.7/silde4_androidNetworking/photo.json";
    RecyclerView rcv_photoRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apiretrofit);
        rcv_photoRetrofit = findViewById(R.id.rcv_photoRetrofit);
    }
}