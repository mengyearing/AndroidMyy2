package com.example.administrator.myapplication.uc1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2018/4/17.
 */

public class uc1_main_Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1_main);

        Button bt1=findViewById(R.id.uc1_main_bt1);
        Button bt2=findViewById(R.id.uc1_main_bt2);
        Button bt3=findViewById(R.id.uc1_main_bt3);
        Button back=findViewById(R.id.back_main);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(uc1_main_Activity.this,uc1_horizontal_Activity.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new  Intent(uc1_main_Activity.this,uc1_vertical_Activity.class);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(uc1_main_Activity.this,uc1_left_Activity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(uc1_main_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}