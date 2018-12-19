package com.cillivian.brushtee.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.cillivian.brushtee.R;
import android.widget.LinearLayout;
/**
 * Time:2018/12/08 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyExchangeView extends LinearLayout{
    public boyExchangeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     *@Date: 2018/12/08 0018
     *@Author:Cillivian
     *@Description:设置跳转
     */
    public void setListeners(View.OnClickListener onClickListener){
        ((ImageButton)this.findViewById(R.id.change_head_boy)).setOnClickListener(onClickListener);
        ((ImageButton)this.findViewById(R.id.close_boy)).setOnClickListener(onClickListener);

    }
}
