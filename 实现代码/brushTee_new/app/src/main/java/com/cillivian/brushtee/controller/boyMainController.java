package com.cillivian.brushtee.controller;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.OnClickListener;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.model.service.boyMainService;
import com.cillivian.brushtee.view.boyMainView;
/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
@SuppressLint("NewApi")
public class boyMainController implements OnClickListener{


    private boyMainService listener1;
    private boyMainView boyView;



    public boyMainController(boyMainView boyView, boyMainService listener1) {
        this.boyView = boyView;
        this.listener1 = listener1;

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.reward:
                listener1.showReward();
                break;
            case R.id.head_boy:
                listener1.exchange();
                break;
            case R.id.Fri_first:
                case R.id.Fri_second:
                    case R.id.Fri_third:
                listener1.onCard(view.getId());
                break;
            case R.id.Sat_first:
                case R.id.Sat_second:
                    case R.id.Sat_third:

                listener1.onCard(view.getId());
                break;
            case R.id.Sun_first:
                case R.id.Sun_second:
                    case R.id.Sun_third:
                listener1.onCard(view.getId());
                break;
            case R.id.Mon_first:
                case R.id.Mon_second:
                    case R.id.Mon_third:
                listener1.onCard(view.getId());
                break;
            case R.id.Tue_first:
                case R.id.Tue_second:
                    case R.id.Tue_third:
                listener1.onCard(view.getId());
                break;
            case R.id.Wed_first:
                case R.id.Wed_second:
                    case R.id.Wed_third:
                listener1.onCard(view.getId());
                break;
            case R.id.Thurs_first:
                case R.id.Thurs_second:
                    case R.id.Thurs_third:
                listener1.onCard(view.getId());
                break;
            default:
                break;


        }
    }
}
