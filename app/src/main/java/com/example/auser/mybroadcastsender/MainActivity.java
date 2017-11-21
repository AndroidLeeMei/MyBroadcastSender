package com.example.auser.mybroadcastsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBrocast(View v){
        Intent intent=new Intent("android.intent.action.CUSTOM_BROADCAST");//夾帶的訊定一定是剛自定的訊息名稱
        sendBroadcast(intent);
        //傳送者不需要做註冊動件
    }
}
