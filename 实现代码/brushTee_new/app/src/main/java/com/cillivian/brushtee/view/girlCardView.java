package com.cillivian.brushtee.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cillivian.brushtee.R;
/**
 * Time:2018/12/08 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlCardView extends LinearLayout {
    public girlCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
/**
*@Date: 2018/12/08 0018
*@Author:Cillivian
*@Description:设置跳转
*/
    public void setListeners(OnClickListener onClickListener){
        //编辑打卡获星
        ((TextView)this.findViewById(R.id.card_num)).setOnClickListener(onClickListener);
        //关闭打卡信息
        ((ImageButton)this.findViewById(R.id.card)).setOnClickListener(onClickListener);
        //切换左右
        ((ImageButton)this.findViewById(R.id.right_arrow_girl)).setOnClickListener(onClickListener);
        ((ImageButton)this.findViewById(R.id.left_arrow_girl)).setOnClickListener(onClickListener);


    }
}
