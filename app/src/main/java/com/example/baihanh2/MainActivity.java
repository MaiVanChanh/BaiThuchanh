package com.example.baihanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;


public class MainActivity extends AppCompatActivity {
        EditText a,b,c;
        Button giai,Thoat;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            a=(EditText)findViewById(R.id.txta);
            b=(EditText)findViewById(R.id.txtb);
            c=(EditText)findViewById(R.id.txtc);
            giai=(Button)findViewById(R.id.btnGiai);
            giai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float x=Float.parseFloat(a.getText().toString());
                    float y=Float.parseFloat(b.getText().toString());
                    float z=Float.parseFloat(c.getText().toString());
                    Intent intent=new Intent(MainActivity.this, NhauNhieu.class);
                    Bundle bundle=new Bundle();
                    String kq=giai(x,y,z);
                    bundle.putString("kq", kq);
                    intent.putExtra("back", bundle);
                    startActivity(intent);
                }
            });
            Thoat=(Button)findViewById(R.id.btnThoat);

            Thoat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        public String giai(float a, float b, float c)
        {
            float s=b*b-4*a*c;
            if(s>0) {
                return "2 nghiệm\n"+
                        "x1= "+(((-b)+ Math.sqrt(s))/2*a)+"\n"+
                        "x2= "+(((-b)- Math.sqrt(s))/2*a);

            }
            if(s==0)
                return "nghiệm kép x1=x2= "+ ((-b)/(2*a));

            return "Vô nghiệm";
        }
    }



