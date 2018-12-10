package com.cillivian.brushtee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeGirlActivity extends AppCompatActivity implements View.OnClickListener{
    private String name_get;
    private Bundle bundle;
    private TextView name_text;
    private SimpleDateFormat simpleDateFormat;
    private String time;
    private TextView time_text;
    private ImageView card_show = null;
    private ImageView iv = null;//图1
    private LinearLayout change_block=null;
    private ImageView star=null;//星星
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
        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm E");
        Date curDate =  new Date(System.currentTimeMillis());
        time=simpleDateFormat.format(curDate);
        name_text=findViewById(R.id.name_girl);
        time_text=findViewById(R.id.time);
        time_text.setText(time);
        name_text.setText(name_get);
        Toast.makeText(getApplicationContext(),"欢迎您，"+name_get+"小公主！",Toast.LENGTH_LONG).show();
        card_show=findViewById(R.id.card_show);
        change_block=findViewById(R.id.change);
        iv =findViewById(R.id.btn_girl);
        iv .setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {


//        if (card_show.getVisibility()==(View.GONE)){
//
////            card_show.setVisibility(View.VISIBLE);
////            card_show.setAlpha(150);
//        }
//        else if (card_show.getVisibility()==(View.VISIBLE)){
//            card_show.setVisibility(View.GONE);
//        }
        setContentView(R.layout.activity_home_boy);

    }
    public void star(View view){
        switch (view.getId()){
            case R.id.line11:
                star =findViewById(R.id.star11);
                break;

            case R.id.line12:
                star =findViewById(R.id.star12);
                break;

            case R.id.line13:
                star =findViewById(R.id.star13);
                break;
            case R.id.line14:
                star =findViewById(R.id.star14);
                break;

            case R.id.line15:
                star =findViewById(R.id.star15);
                break;

            case R.id.line16:
                star =findViewById(R.id.star16);
                break;
            case R.id.line17:
                star =findViewById(R.id.star17);
                break;
            case R.id.line21:
                star =findViewById(R.id.star21);
                break;
            case R.id.line22:
                star =findViewById(R.id.star22);
                break;
            case R.id.line23:
                star =findViewById(R.id.star23);
                break;
            case R.id.line24:
                star =findViewById(R.id.star24);
                break;
            case R.id.line25:
                star =findViewById(R.id.star25);
                break;
            case R.id.line26:
                star =findViewById(R.id.star26);
                break;
            case R.id.line27:
                star =findViewById(R.id.star27);
                break;
            case R.id.line31:
                star =findViewById(R.id.star31);
                break;
            case R.id.line32:
                star =findViewById(R.id.star32);
                break;
            case R.id.line33:
                star =findViewById(R.id.star33);
                break;
            case R.id.line34:
                star =findViewById(R.id.star34);
                break;
            case R.id.line35:
                star =findViewById(R.id.star35);
                break;
            case R.id.line36:
                star =findViewById(R.id.star36);
                break;
            case R.id.line37:
                star =findViewById(R.id.star37);
                break;
        }
        star.setVisibility(View.VISIBLE);
    }
}
