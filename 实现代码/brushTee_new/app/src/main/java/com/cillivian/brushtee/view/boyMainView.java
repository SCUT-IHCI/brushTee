package com.cillivian.brushtee.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.cillivian.brushtee.R;

/**
 * Time:2018/12/08 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyMainView extends LinearLayout{

    /**
    *@Date: 2018/12/18 0018
    *@Author:Cillivian
    *@Description:设置跳转
    */
    public void setListeners(OnClickListener onClickListener){
        //奖励页面
        ((ImageView)findViewById(R.id.reward)).setOnClickListener(onClickListener);
        //切换用户
        ((ImageButton)findViewById(R.id.head_boy)).setOnClickListener(onClickListener);
        //打卡
        ((ImageButton)findViewById(R.id.Fri_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Fri_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Fri_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sat_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sat_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sat_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sun_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sun_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Sun_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Mon_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Mon_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Mon_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Tue_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Tue_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Tue_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Thurs_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Thurs_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Thurs_third)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Wed_first)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Wed_second)).setOnClickListener(onClickListener);
        ((ImageButton)findViewById(R.id.Wed_third)).setOnClickListener(onClickListener);
    }
    public boyMainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
