package com.cillivian.brushtee.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cillivian.brushtee.model.Card;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.model.UI;
import java.util.Date;
import java.text.SimpleDateFormat;


public class HomeBoyActivity extends AppCompatActivity implements View.OnClickListener {

    private String name_get;
    private Bundle bundle;
    private TextView name_text;
    private UI ui;
    private SimpleDateFormat simpleDateFormat;
    private String time;
    private TextView time_text;
    private LinearLayout cardView = null;
    private ImageView iv = null;//图1
    private LinearLayout change_block=null;
    private ImageView star=null;//星星
    private ImageView imageView;
    private LinearLayout award;
    private int num;
    private int[]images;
    private int index;
    private Card card;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_boy);

        initUI();
//        InitData initData;
        initData();

    }

    private void initUI() {
        bundle = getIntent().getExtras();
        name_get = bundle.getString("name");
        Log.i("girl","name is "+name_get);
        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm E");//获取当前时间
        Date curDate =  new Date(System.currentTimeMillis());
        time=simpleDateFormat.format(curDate);
//        time=ui.initUI();
        name_text=findViewById(R.id.name_boy);
        time_text=findViewById(R.id.time);
        name_text.setText(name_get);
        time=ui.initUI();
        time_text.setText(time);
        Toast.makeText(getApplicationContext(),"欢迎您，"+name_get+"小王子!",Toast.LENGTH_LONG).show();//欢迎语
        cardView=findViewById(R.id.card_view);
        change_block=findViewById(R.id.change);
      iv =findViewById(R.id.btn_boy);
      iv .setOnClickListener(this);
        imageView=findViewById(R.id.card_night);
        findViewById(R.id.pre).setOnClickListener(this);
        findViewById(R.id.next).setOnClickListener(this);
        findViewById(R.id.back_boy).setOnClickListener(this);
        findViewById(R.id.card_boy).setOnClickListener(this);//事件处理
        award=findViewById(R.id.award);


    }
    /*
    *翻页
    */

    @Override
    public void onClick(View view) {

        Intent intent=new Intent();
        intent.putExtra("name",name_get);
        switch (view.getId()){
            case R.id.next:
                if(index==num-1)
                {
                    index=0;
                }
                else{
                    index++;
                }
                break;
            case R.id.pre:
                if(index==0)
                {
                    index=num-1;
                }else {
                    index--;
                }
                break;
            case R.id.back_boy:
                cardView.setVisibility(View.GONE);
                break;
            case R.id.btn_boy:
                intent.setClass(getApplicationContext(),HomeGirlActivity.class);
                this.startActivity(intent);
                break;
            case R.id.card_boy:
                if(award.getVisibility()==View.VISIBLE){
                    award.setVisibility(View.GONE);
                }
                else if(award.getVisibility()==View.GONE){
                    award.setVisibility(View.VISIBLE);
                }
                break;
        }

        updateImage();


    }
    public void  close(){
        cardView.setVisibility(View.GONE);
    }
    public void change(){
        change_block.setVisibility(View.VISIBLE);
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
        cardView.setVisibility(View.VISIBLE);
    }
    private void  initData()
    {

//        card.setImages(new int[]{R.drawable.star4,R.drawable.star5});
        images=new int[]{R.drawable.star4,R.drawable.star5,};
        imageView.setImageResource(images[0]);
//        images= card.getImages();
//        imageView.setImageResource(images[0]);

        num =images.length;
        index = 0;
    }
    public void updateImage(){
        imageView.setImageResource(images[index]);
    }
}
