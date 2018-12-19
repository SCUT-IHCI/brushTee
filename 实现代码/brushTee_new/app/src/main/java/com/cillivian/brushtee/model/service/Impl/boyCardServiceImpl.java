package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.controller.MainActivityController;
import com.cillivian.brushtee.controller.boyCardController;
import com.cillivian.brushtee.model.service.boyCardService;
import com.cillivian.brushtee.view.boyCardView;

/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyCardServiceImpl extends Activity implements boyCardService {

    MainActivityController mainActivityController =MainActivityController.getInstance();

    private String rand;
   private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Intent intent=getIntent();
//       Bundle bundle =intent.getExtras();
//       rand=bundle.toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boy_card);
        mainActivityController.addActivity(this);
        boyCardController onCardController=new boyCardController((boyCardView)this.findViewById(R.id.card_boy),this);
        ((boyCardView)this.findViewById(R.id.card_boy)).setListeners(onCardController);
//       textView=findViewById(R.id.card_num);
//       textView.setText(rand);无法获取
    }
    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义左跳转
     */
    @Override
    public void leftSlide() {
        ((ImageButton)findViewById(R.id.left_arrow)).setImageResource(R.drawable.disappear_boy);
        ((ImageButton)findViewById(R.id.right_arrow)).setImageResource(R.drawable.right_arrow_boy);
        ((ImageButton)findViewById(R.id.card)).setImageResource(R.drawable.sun);
    }
    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义关闭
     */
    @Override
    public void cardClose() {
        finish();
    }
    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义右跳转
     */
    @Override
    public void rightSlide() {
        ((ImageButton)findViewById(R.id.right_arrow)).setImageResource(R.drawable.disappear_boy);
        ((ImageButton)findViewById(R.id.left_arrow)).setImageResource(R.drawable.left_arrow_boy);
        ((ImageButton)findViewById(R.id.card)).setImageResource(R.drawable.moon);
    }
}
