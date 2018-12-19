package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.controller.MainActivityController;
import com.cillivian.brushtee.controller.boyMainController;
import com.cillivian.brushtee.model.entity.reward;
import com.cillivian.brushtee.model.service.boyMainService;
import com.cillivian.brushtee.model.entity.mainData;
import com.cillivian.brushtee.view.boyMainView;
import com.cillivian.brushtee.model.entity.updateTime;
/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */

public class boyMainServiceImpl extends Activity implements boyMainService {

    mainData Data=mainData.getInstance();
    MainActivityController mainActivityController =MainActivityController.getInstance();
    private int rand;
    private updateTime updateTime;
    /**
     *@Date: 2018/12/10 0019
     *@Author:Cillivian
     *@Description:
     */
    private TextView update=null;
    private String time=null;

    public void setTime() {
        update = findViewById(R.id.time);
        time = updateTime.getTime();
        update.setText(time);

    }
reward  reward;
LinearLayout rewardBoard;
/**
*@Date: 2018/12/10 0018
*@Author:Cillivian
*@Description:显示奖励页面
*/
    public void showReward(){
       rewardBoard= findViewById(R.id.reward_board);
       if(rewardBoard.getVisibility()==View.GONE){
        rewardBoard.setVisibility(View.VISIBLE);
       }else {
           rewardBoard.setVisibility(View.GONE);
       }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.boy_main);
        mainActivityController.addActivity(this);
        ((TextView)findViewById(R.id.coin_number_boy)).setText(String.valueOf(Data.getCoin_numbers()));
        ((TextView)findViewById(R.id.time_boy)).setText(String.valueOf(Data.getTime()));

        setStar();
        boyMainController boyMainControllerInstance =new boyMainController((boyMainView)this.findViewById(R.id.boy),this);
        ((boyMainView)this.findViewById(R.id.boy)).setListeners(boyMainControllerInstance);

    }



    public void exchange(){
        String data=String.valueOf(Data.getCoin_numbers());
        Intent intent = new Intent(boyMainServiceImpl.this,boyExcahngeServiceImpl.class);
        intent.putExtra("extra_data",data);
        this.startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        mainActivityController.finishAll();
    }
/**
*@Date: 2018/12/10 0018
*@Author:Cillivian
*@Description:打卡函数实现
*/
    public void onCard(int buttonID){
        rand=Data.getRandNumber();
        int place=21;
        switch (buttonID){
            case R.id.Fri_first:
                place=0;
                break;
            case R.id.Fri_second:
                place=7;
                break;
            case R.id.Fri_third:
                place=14;
                break;
            case R.id.Sat_first:
                place=1;
                break;
            case R.id.Sat_second:
                place=8;
                break;
            case R.id.Sat_third:
                place=15;
                break;
            case R.id.Sun_first:
                place=2;
                break;
            case R.id.Sun_second:
                place=9;
                break;
            case R.id.Sun_third:
                place=16;
                break;
            case R.id.Mon_first:
                place=3;
                break;
            case R.id.Mon_second:
                place=10;
                break;
            case R.id.Mon_third:
                place=17;
                break;
            case R.id.Tue_first:
                place=4;
                break;
            case R.id.Tue_second:
                place=11;
                break;
            case R.id.Tue_third:
                place=18;
                break;
            case R.id.Wed_first:
                place=5;
                break;
            case R.id.Wed_second:
                place=12;
                break;
            case R.id.Wed_third:
                place=19;
                break;
            case R.id.Thurs_first:
                place=6;
                break;
            case R.id.Thurs_second:
                place=13;
                break;
            case R.id.Thurs_third:
                place=20;
                break;
        }
        if(Data.getCard_record()[place]==1||place==21)
            return;
        else{
            Intent intent = new Intent(boyMainServiceImpl.this,boyCardServiceImpl.class);
            this.startActivity(intent);
            //传输打卡信息
            intent.putExtra("rand",rand);
            Data.setCard_recordOne(place);
            ((ImageButton)findViewById(buttonID)).setImageResource(R.drawable.star);
            Data.setAddNumbers();
            Data.addCoins();
            ((TextView)findViewById(R.id.coin_number_boy)).setText(String.valueOf(Data.getCoin_numbers()));
        }

    }
/**
*@Date: 2018/12/12 0018
*@Author:Cillivian
*@Description:星星显示
*/
    public void setStar(){
        for(int i=0;i<21;++i)
        {
            if(Data.getCard_record()[i]==1)
            {
                switch (i){
                    case 0:
                        ((ImageButton)findViewById(R.id.Fri_first)).setImageResource(R.drawable.star);
                        break;
                    case 1:
                        ((ImageButton)findViewById(R.id.Sat_first)).setImageResource(R.drawable.star);
                        break;
                    case 2:
                        ((ImageButton)findViewById(R.id.Sun_first)).setImageResource(R.drawable.star);
                        break;
                    case 3:
                        ((ImageButton)findViewById(R.id.Mon_first)).setImageResource(R.drawable.star);
                        break;
                    case 4:
                        ((ImageButton)findViewById(R.id.Tue_first)).setImageResource(R.drawable.star);
                        break;
                    case 5:
                        ((ImageButton)findViewById(R.id.Wed_first)).setImageResource(R.drawable.star);
                        break;
                    case 6:
                        ((ImageButton)findViewById(R.id.Thurs_first)).setImageResource(R.drawable.star);
                        break;
                    case 7:
                        ((ImageButton)findViewById(R.id.Fri_second)).setImageResource(R.drawable.star);
                        break;
                    case 8:
                        ((ImageButton)findViewById(R.id.Sat_second)).setImageResource(R.drawable.star);
                        break;
                    case 9:
                        ((ImageButton)findViewById(R.id.Sun_second)).setImageResource(R.drawable.star);
                        break;
                    case 10:
                        ((ImageButton)findViewById(R.id.Mon_second)).setImageResource(R.drawable.star);
                        break;
                    case 11:
                        ((ImageButton)findViewById(R.id.Tue_second)).setImageResource(R.drawable.star);
                        break;
                    case 12:
                        ((ImageButton)findViewById(R.id.Wed_second)).setImageResource(R.drawable.star);
                        break;
                    case 13:
                        ((ImageButton)findViewById(R.id.Thurs_second)).setImageResource(R.drawable.star);
                        break;
                    case 14:
                        ((ImageButton)findViewById(R.id.Fri_third)).setImageResource(R.drawable.star);
                        break;
                    case 15:
                        ((ImageButton)findViewById(R.id.Sat_third)).setImageResource(R.drawable.star);
                        break;
                    case 16:
                        ((ImageButton)findViewById(R.id.Sun_third)).setImageResource(R.drawable.star);
                        break;
                    case 17:
                        ((ImageButton)findViewById(R.id.Mon_third)).setImageResource(R.drawable.star);
                        break;
                    case 18:
                        ((ImageButton)findViewById(R.id.Tue_third)).setImageResource(R.drawable.star);
                        break;
                    case 19:
                        ((ImageButton)findViewById(R.id.Wed_third)).setImageResource(R.drawable.star);
                        break;
                    case 20:
                        ((ImageButton)findViewById(R.id.Thurs_third)).setImageResource(R.drawable.star);
                        break;



                }
            }
        }
    }
}
