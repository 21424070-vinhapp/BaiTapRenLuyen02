package com.example.baitaprenluyen02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mBtnThoat=findViewById(R.id.btnThoat);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}