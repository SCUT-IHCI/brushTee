package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.MainActivity;
import com.cillivian.brushtee.controller.boyExchangeController;
import com.cillivian.brushtee.model.service.boyExchangeService;
import com.cillivian.brushtee.view.boyExchangeView;

/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyExchangeServiceImpl extends Activity implements boyExchangeService {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity mainActivity =MainActivity.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.boy_exchange);
        mainActivity.addActivity(this);
        Intent intent=getIntent();
        String data=intent.getStringExtra("data");
        ((TextView)findViewById(R.id.coin_boy_get)).setText(data);
        boyExchangeController boyExchangeControllerInstance =new boyExchangeController((boyExchangeView)this.findViewById(R.id.boy_exchange),this);
        ((boyExchangeView)this.findViewById(R.id.boy_exchange)).setListeners(boyExchangeControllerInstance);
    }
    public void ExchangeShowTheme(){
        Intent intent = new Intent(boyExchangeServiceImpl.this,girlMainServiceImpl.class);
        this.startActivity(intent);
    }
    public void back(){
        finish();
    }
}
