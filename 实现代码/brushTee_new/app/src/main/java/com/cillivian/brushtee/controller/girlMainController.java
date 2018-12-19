package com.cillivian.brushtee.controller;

import android.view.View;

import com.cillivian.brushtee.model.service.girlMainService;
import com.cillivian.brushtee.view.girlMainView;
import com.cillivian.brushtee.R;

/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlMainController implements View.OnClickListener {
    private girlMainService listener;
    private girlMainView girlView;

    public girlMainController(girlMainView girlView, girlMainService listener) {
        this.girlView = girlView;
        this.listener = listener;

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.reward:
                listener.showReward();
                break;
            case R.id.head_girl:
                listener.exchange();
                break;
            case R.id.Fri_first:
                case R.id.Fri_second:
                    case R.id.Fri_third:
                listener.onCard(v.getId());
                break;
            case R.id.Sat_first:
                case R.id.Sat_second:
                    case R.id.Sat_third:
                listener.onCard(v.getId());
                break;
            case R.id.Sun_first:
                case R.id.Sun_second:
                    case R.id.Sun_third:
                listener.onCard(v.getId());
                break;
            case R.id.Mon_first:
                case R.id.Mon_second:
                    case R.id.Mon_third:
                listener.onCard(v.getId());
                break;
            case R.id.Tue_first:
                case R.id.Tue_second:
                    case R.id.Tue_third:
                listener.onCard(v.getId());
                break;
            case R.id.Wed_first:
                case R.id.Wed_second:
                    case R.id.Wed_third:
                listener.onCard(v.getId());
                break;
            case R.id.Thurs_first:
                case R.id.Thurs_second:
                    case R.id.Thurs_third:
                listener.onCard(v.getId());
                break;
            default:
                break;
        }
    }
}
