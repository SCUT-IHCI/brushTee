package com.cillivian.brushtee.controller;

import android.view.View;

import com.cillivian.brushtee.model.service.boyExchangeService;
import com.cillivian.brushtee.R;
import com.cillivian.brushtee.view.boyExchangeView;
/**
 * Time:2018/12/08 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyExchangeController implements View.OnClickListener {
    private boyExchangeService listener;
    private boyExchangeView boyExchangeView;
    public boyExchangeController(boyExchangeView boyExchangeView, boyExchangeService listener) {
        this.boyExchangeView = boyExchangeView;
        this.listener = listener;
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.change_head_boy:
                listener.ExchangeShowTheme();
                break;
            case R.id.close_boy:
                listener.back();
                break;
        }
    }
}
