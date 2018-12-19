package com.cillivian.brushtee.model.entity;

import android.view.View;
import android.widget.ImageView;

import com.cillivian.brushtee.R;

/**
 * Time:2018/12/08 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class reward {
private ImageView reward=null;
private int[]images;
public reward(){
    images=new int[]{1,2,3,4,5,6,7,8,9};
}
    public ImageView getReward() {
        return reward;
    }

    public void setReward(int id) {

        this.reward = reward;
    }
}
