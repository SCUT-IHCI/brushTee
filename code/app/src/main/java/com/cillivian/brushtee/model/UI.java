package com.cillivian.brushtee.model;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.R;

import android.content.Intent;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UI {

    private SimpleDateFormat simpleDateFormat;
    private String time;

    public String initUI(){

        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm E");//获取当前时间
        Date curDate =  new Date(System.currentTimeMillis());
        time=simpleDateFormat.format(curDate);
       return time;
    }
}
