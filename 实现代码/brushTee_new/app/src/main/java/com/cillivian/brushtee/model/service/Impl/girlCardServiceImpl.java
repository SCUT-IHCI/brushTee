package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.MainActivity;
import com.cillivian.brushtee.controller.girlCardController;
import com.cillivian.brushtee.view.girlCardView;
/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */

public class girlCardServiceImpl extends Activity implements com.cillivian.brushtee.model.service.girlCardService {

    private String rand;
    private TextView textView;
    private int num;
    private int[]images;
    private int index;
    private ImageButton imageButton;
    MainActivity mainActivity =MainActivity.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Intent intent=getIntent();
//       Bundle bundle =intent.getExtras();
//       rand=bundle.toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.girl_card);
        mainActivity.addActivity(this);
        girlCardController onCardController=new girlCardController((girlCardView) this.findViewById(R.id.card_girl),this);
        ((girlCardView)this.findViewById(R.id.card_girl)).setListeners(onCardController);
        initData();
    }
    public void initData(){
        images=new int[]{R.drawable.sun,R.drawable.moon,R.drawable.s1,R.drawable.s2};
        imageButton=findViewById(R.id.card);
        imageButton.setImageResource(images[0]);
        num =images.length;
        index = 0;
    }
    public void updateImage(){
        imageButton.setImageResource(images[index]);
    }
    /**
    *@Date: 2018/12/10 0018
    *@Author:Cillivian
    *@Description:定义左跳转
    */
    public void pre() {
        if(index==num-1)
        {
            index=0;
        }
        else{
            index++;
        }
        updateImage();
    }




    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义右跳转
     */
    @Override
    public void next() {
        if(index==0)
        {
            index=num-1;
        }else {
            index--;
        }
        updateImage();

    }
    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义关闭
     */
    @Override
    public void cardClose() {

        finish();
        Toast.makeText(getApplicationContext(),"打卡成功!",Toast.LENGTH_LONG).show();//提示语
    }
}
