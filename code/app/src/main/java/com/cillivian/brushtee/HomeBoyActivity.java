package com.cillivian.brushtee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class HomeBoyActivity extends AppCompatActivity {

    private String name_get;
    private Bundle bundle;
    private TextView name_text;
    private SimpleDateFormat simpleDateFormat;
    private String time;
    private TextView time_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_boy);
        initUI();

    }

    private void initUI() {
        bundle = getIntent().getExtras();
        name_get = bundle.getString("name");
        Log.i("girl","name is "+name_get);
        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm E");
        Date curDate =  new Date(System.currentTimeMillis());
        time=simpleDateFormat.format(curDate);
        name_text=findViewById(R.id.name_boy);
        time_text=findViewById(R.id.time);
        name_text.setText(name_get);
        time_text.setText(time);

        Toast.makeText(getApplicationContext(),"欢迎您，"+name_get+"小王子!",Toast.LENGTH_LONG).show();
    }

}
