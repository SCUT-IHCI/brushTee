package com.cillivian.brushtee.controller;

import android.view.View;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.model.service.girlCardService;
import com.cillivian.brushtee.view.girlCardView;
/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */

public class girlCardController implements View.OnClickListener{
    private girlCardView girlCardView;
    private girlCardService listener;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.card:
                listener.cardClose();
                break;
            case R.id.right_arrow_girl:
                listener.next();
                break;
            case R.id.left_arrow_girl:
                listener.pre();
                break;
            default:
                break;
        }
    }
    public girlCardController(girlCardView girlCardView, girlCardService listener){
        this.girlCardView=girlCardView;
        this.listener=listener;
    }



}
