package com.cillivian.brushtee.model.entity;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Time:2018/12/19 0019
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class updateTime {
    private String time;
    private SimpleDateFormat simpleDateFormat;

    Date curDate =  new Date(System.currentTimeMillis());

    public updateTime(){
        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm E");//获取当前时间
        time=simpleDateFormat.format(curDate);//格式化时间

    }
    public  String getTime(){
        return this.time;
    }
}
