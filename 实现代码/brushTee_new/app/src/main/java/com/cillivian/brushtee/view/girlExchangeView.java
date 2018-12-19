package com.cillivian.brushtee.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.cillivian.brushtee.R;
/**
 * Time:2018/12/08 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlExchangeView extends LinearLayout {
    /**
     *@Date: 2018/12/08 0018
     *@Author:Cillivian
     *@Description:设置跳转
     */
    public girlExchangeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setListeners(OnClickListener onClickListener){
        ((ImageButton)this.findViewById(R.id.change_head_girl)).setOnClickListener(onClickListener);
        ((ImageButton)this.findViewById(R.id.close_girl)).setOnClickListener(onClickListener);

    }
}
