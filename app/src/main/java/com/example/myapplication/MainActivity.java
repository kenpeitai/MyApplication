package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button2_login);
        TextView textView = (TextView) findViewById(R.id.zhuce);
        Button button_xinlang = (Button) findViewById(R.id.button3_xinLangWeiBo);
        Button button_tengxun = (Button) findViewById(R.id.button4_tengXunWeiBo);
        button_xinlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"登陆成功，1s后跳转",Toast.LENGTH_SHORT).show();
            }
        });

        button_tengxun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"登陆成功，1s后跳转",Toast.LENGTH_SHORT).show();
            }
        });


        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

}
