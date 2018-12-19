package com.cillivian.brushtee.controller;

import android.view.View;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.model.service.boyCardService;
import com.cillivian.brushtee.view.boyCardView;

/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyCardController implements View.OnClickListener {
    private boyCardView boyCardView;
    private boyCardService listener;

    public boyCardController(boyCardView boyCardView, boyCardService listener){
        this.boyCardView=boyCardView;
        this.listener=listener;
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.card:
                listener.cardClose();
                break;
            case R.id.right_arrow:
                listener.next();
                break;
            case R.id.left_arrow:
                listener.pre();
                break;
            default:
                break;
        }
    }
}
