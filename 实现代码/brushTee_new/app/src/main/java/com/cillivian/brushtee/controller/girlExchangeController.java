package com.cillivian.brushtee.controller;

import android.view.View;

import com.cillivian.brushtee.model.service.girlExchangeService;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.view.girlExchangeView;
/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlExchangeController implements View.OnClickListener{
    private girlExchangeService listener;
    private girlExchangeView girlChooseView;
    public girlExchangeController(girlExchangeView girlExchangeView, girlExchangeService listener) {
        this.girlChooseView = girlExchangeView;
        this.listener = listener;
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.change_head_girl:
                listener.ExchangeShowTheme();
                break;
            case R.id.close_girl:
                listener.back();
                break;
        }
    }
}
