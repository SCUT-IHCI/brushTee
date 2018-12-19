package com.cillivian.brushtee.model.service.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.MainActivity;
import com.cillivian.brushtee.controller.boyCardController;
import com.cillivian.brushtee.model.service.boyCardService;
import com.cillivian.brushtee.view.boyCardView;

/**
 * Time:2018/12/08 1105
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class boyCardServiceImpl extends Activity implements boyCardService {

    MainActivity mainActivity =MainActivity.getInstance();

    private String rand;
   private TextView textView;
    private int num;
    private int[]images;
    private int index;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Intent intent=getIntent();
//       Bundle bundle =intent.getExtras();
//       rand=bundle.toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boy_card);
        mainActivity.addActivity(this);
        boyCardController onCardController=new boyCardController((boyCardView)this.findViewById(R.id.card_boy),this);
        ((boyCardView)this.findViewById(R.id.card_boy)).setListeners(onCardController);
//       textView=findViewById(R.id.card_num);
//       textView.setText(rand);无法获取
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
    @Override
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
     *@Description:定义关闭
     */
    @Override
    public void cardClose() {

        finish();
        Toast.makeText(getApplicationContext(),"打卡成功!",Toast.LENGTH_LONG).show();//提示语
    }
    /**
     *@Date: 2018/12/10 0018
     *@Author:Cillivian
     *@Description:定义右跳转
     */
    @Override
    public void next() {
        //传输数据
        if(index==0)
        {
            index=num-1;
        }else {
            index--;
        }
        updateImage();
    }
}
