package com.example.administrator.myapplication.uc1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2018/4/12.
 */

public class uc1_vertical_Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1_vertical);
        Button back=(Button)findViewById(R.id.back_vertical);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(uc1_vertical_Activity.this,uc1_main_Activity.class);
                startActivity(intent);
            }
        });
    }
}