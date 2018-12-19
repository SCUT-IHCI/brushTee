package com.cillivian.brushtee.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.cillivian.brushtee.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText nameText;
    private String username ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

    }

    private void initUI() {
        findViewById(R.id.login_boy).setOnClickListener(this);
        findViewById(R.id.login_girl).setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        nameText = findViewById(R.id.user_name);
        String temp=nameText.getText().toString().trim();
        if(temp!=""||temp!=null){
            username = temp;
        }else {
            username="小Tee";
        }

        Intent intent =new Intent();
        intent.putExtra("name",username);
        Log.d("test","name"+username);
        switch (view.getId()){
            case R.id.login_boy :
                intent.setClass(getApplicationContext(),HomeBoyActivity.class);
                break;
            case R.id.login_girl:
                intent.setClass(getApplicationContext(),HomeGirlActivity.class);
                break;

        }

        this.startActivity(intent);
    }

}
