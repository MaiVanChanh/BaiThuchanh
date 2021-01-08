package com.example.baihanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NhauNhieu extends AppCompatActivity {
    Button close;
    TextView ng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kqhien);
        Intent call=getIntent();
        Bundle bundle=call.getBundleExtra("back");
        String s=bundle.getString("kq");
        close=(Button)findViewById(R.id.btnThoat2);
        ng=(TextView)findViewById(R.id.txtKQ) ;
        ng.setText(s);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}