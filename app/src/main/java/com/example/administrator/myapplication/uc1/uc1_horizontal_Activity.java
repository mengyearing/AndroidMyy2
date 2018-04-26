package com.example.administrator.myapplication.uc1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2018/4/12.
 */

public class uc1_horizontal_Activity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1_horizontal);
        Button back=findViewById(R.id.back_hor);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(uc1_horizontal_Activity.this,uc1_main_Activity.class);
                startActivity(intent);
            }
        });
    }
}