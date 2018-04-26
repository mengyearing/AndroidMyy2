package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2018/4/17.
 */

public class uc3_main_Activity extends AppCompatActivity{
    int[] imagesIds=new int[]
            {
              R.drawable.fruit1,
              R.drawable.fruit2,
              R.drawable.fruit3,
              R.drawable.fruit4,
              R.drawable.fruit5
            };
    int[] names=new int[]
            {
              R.id.show1,
              R.id.show2,
              R.id.show3,
              R.id.show4,
              R.id.show5
            };
    ImageView[] imageViews=new ImageView[names.length];
    int currentImageId =0;
    final Handler myhandle = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            if (msg.what==0x1233)
            {
                for (int i=0;i<names.length;i++)
                {
                    imageViews[i].setBackgroundResource(imagesIds[(i+ currentImageId)%names.length]);

                }
                currentImageId++;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3_main);
        Button back=(Button)findViewById(R.id.back_un3_main);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(uc3_main_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        for (int i=0;i<names.length;i++){
            imageViews[i]=findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                myhandle.sendEmptyMessage(0x1233);
            }
        },0,1200);
    }
}
