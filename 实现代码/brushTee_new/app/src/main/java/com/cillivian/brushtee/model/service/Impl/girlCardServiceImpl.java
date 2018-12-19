package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.controller.MainActivityController;
import com.cillivian.brushtee.controller.girlCardController;
import com.cillivian.brushtee.model.service.girlCardService;
import com.cillivian.brushtee.view.girlCardView;
/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */

public class girlCardServiceImpl extends Activity implements com.cillivian.brushtee.model.service.girlCardService {

    MainActivityController mainActivityController =MainActivityController.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.girl_card);
        mainActivityController.addActivity(this);
        girlCardController onCardController=new girlCardController((girlCardView) this.findViewById(R.id.card_girl),this);
        ((girlCardView)this.findViewById(R.id.card_girl)).setListeners(onCardController);
    }/**
    *@Date: 2018/12/10 0018
    *@Author:Cillivian
    *@Description:定义左跳转
    */
    public void leftSlide() {
        ((ImageButton)findViewById(R.id.left_arrow_girl)).setImageResource(R.drawable.disppear_girl);
        ((ImageButton)findViewById(R.id.right_arrow_girl)).setImageResource(R.drawable.right_arrow_girl);
        ((ImageButton)findViewById(R.id.card)).setImageResource(R.drawable.sun);
    }



    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义右跳转
     */
    @Override
    public void rightSlide() {
        ((ImageButton)findViewById(R.id.right_arrow_girl)).setImageResource(R.drawable.disppear_girl);
        ((ImageButton)findViewById(R.id.left_arrow_girl)).setImageResource(R.drawable.left_arrow_girl);
        ((ImageButton)findViewById(R.id.card)).setImageResource(R.drawable.moon);
    }/**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义关闭
     */
    @Override
    public void cardClose() {
        finish();
    }
}
