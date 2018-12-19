package com.cillivian.brushtee.model.service.Impl;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cillivian.brushtee.model.entity.reward;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.MainActivity;
import com.cillivian.brushtee.controller.girlMainController;
import com.cillivian.brushtee.model.entity.mainData;
import com.cillivian.brushtee.view.girlMainView;
import com.cillivian.brushtee.model.service.girlMainService;
/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlMainServiceImpl extends Activity implements girlMainService {

    MainActivity mainActivity =MainActivity.getInstance();
    mainData Data=mainData.getInstance();
    LinearLayout rewardBoard;
    reward reward;
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
        setContentView(R.layout.girl_main);
        mainActivity.addActivity(this);
        ((TextView)findViewById(R.id.coin_number_girl)).setText(String.valueOf(Data.getCoin_numbers()));
        ((TextView)findViewById(R.id.time_girl)).setText(String.valueOf(Data.getTime()));
        Toast.makeText(getApplicationContext(),"欢迎您，小公主!",Toast.LENGTH_LONG).show();//欢迎语
        /**
         *@Date: 2018/12/10 0019
         *@Author:Cillivian
         *@Description:
         */
        starShow();
        girlMainController controller=new girlMainController((girlMainView) this.findViewById(R.id.girl),this);
        ((girlMainView)this.findViewById(R.id.girl)).setListeners(controller);
    }
    public void exchange(){
        String data=String.valueOf(Data.getCoin_numbers());
        Intent intent = new Intent(girlMainServiceImpl.this,girlExchangeServiceImpl.class);
        intent.putExtra("data",data);
        this.startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        mainActivity.close();
    }

    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:打卡函数实现
     */
    public void onCard(int buttonID){
        int coordinate=21;
        switch (buttonID){
            case R.id.Fri_first:
                coordinate=0;
                break;
            case R.id.Fri_second:
                coordinate=7;
                break;
            case R.id.Fri_third:
                coordinate=14;
                break;
            case R.id.Sat_first:
                coordinate=1;
                break;
            case R.id.Sat_second:
                coordinate=8;
                break;
            case R.id.Sat_third:
                coordinate=15;
                break;
            case R.id.Sun_first:
                coordinate=2;
                break;
            case R.id.Sun_second:
                coordinate=9;
                break;
            case R.id.Sun_third:
                coordinate=16;
                break;
            case R.id.Mon_first:
                coordinate=3;
                break;
            case R.id.Mon_second:
                coordinate=10;
                break;
            case R.id.Mon_third:
                coordinate=17;
                break;
            case R.id.Tue_first:
                coordinate=4;
                break;
            case R.id.Tue_second:
                coordinate=11;
                break;
            case R.id.Tue_third:
                coordinate=18;
                break;
            case R.id.Wed_first:
                coordinate=5;
                break;
            case R.id.Wed_second:
                coordinate=12;
                break;
            case R.id.Wed_third:
                coordinate=19;
                break;
            case R.id.Thurs_first:
                coordinate=6;
                break;
            case R.id.Thurs_second:
                coordinate=13;
                break;
            case R.id.Thurs_third:
                coordinate=20;
                break;
        }
        if(Data.getCard_record()[coordinate]==1||coordinate==21)
            return;
        else{
            Intent intent = new Intent(girlMainServiceImpl.this,girlCardServiceImpl.class);
            this.startActivity(intent);
            Data.setOneCard(coordinate);
            ((ImageButton)findViewById(buttonID)).setImageResource(R.drawable.star);
            Data.setSum();
            Data.addCoins();
            ((TextView)findViewById(R.id.coin_number_girl)).setText(String.valueOf(Data.getCoin_numbers()));
        }
    }

    public void starShow(){
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
