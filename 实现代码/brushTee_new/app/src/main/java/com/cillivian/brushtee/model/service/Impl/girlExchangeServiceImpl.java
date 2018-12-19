package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.MainActivity;
import com.cillivian.brushtee.controller.girlExchangeController;
import com.cillivian.brushtee.model.service.girlExchangeService;
import com.cillivian.brushtee.view.girlExchangeView;

/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class girlExchangeServiceImpl extends Activity implements girlExchangeService {

    MainActivity mainActivity =MainActivity.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.girl_exchange);
        mainActivity.addActivity(this);
        Intent intent=getIntent();
        String data=intent.getStringExtra("data");
        ((TextView)findViewById(R.id.coin_girl_get)).setText(data);
        girlExchangeController girlChoose=new girlExchangeController((girlExchangeView) this.findViewById(R.id.girl_exchange),this);
        ((girlExchangeView)this.findViewById(R.id.girl_exchange)).setListeners(girlChoose);
    }
    public void ExchangeShowTheme(){
        Intent intent = new Intent(girlExchangeServiceImpl.this,boyMainServiceImpl.class);
        this.startActivity(intent);
    }
    public void back(){
        finish();
    }
}
