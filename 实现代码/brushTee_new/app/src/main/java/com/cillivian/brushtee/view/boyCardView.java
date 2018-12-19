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
public class boyCardView extends LinearLayout {
    public boyCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     *@Date: 2018/12/08 0018
     *@Author:Cillivian
     *@Description:设置跳转
     */
    public void setListeners(OnClickListener onClickListener){
        ((ImageButton)this.findViewById(R.id.right_arrow)).setOnClickListener(onClickListener);
        ((ImageButton)this.findViewById(R.id.left_arrow)).setOnClickListener(onClickListener);
        ((ImageButton)this.findViewById(R.id.card)).setOnClickListener(onClickListener);

    }
}
