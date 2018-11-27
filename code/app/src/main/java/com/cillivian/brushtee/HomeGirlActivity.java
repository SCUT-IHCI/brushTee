package com.cillivian.brushtee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class HomeGirlActivity extends AppCompatActivity {
    private String name_get;
    private Bundle bundle;
    private TextView name_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_girl);
        initUI();

    }

    private void initUI() {
        bundle = getIntent().getExtras();
        name_get = bundle.getString("name");
        Log.i("girl","name is "+name_get);
        name_text=findViewById(R.id.name_girl);
        name_text.setText(name_get);
        Toast.makeText(getApplicationContext(),"欢迎您，小公主！",Toast.LENGTH_LONG).show();
    }
}
