package com.cillivian.brushtee.model.entity;
import java.util.Random;
import com.cillivian.brushtee.model.service.Impl.boyMainServiceImpl;
import com.cillivian.brushtee.model.entity.updateTime;
/**
 * Time:2018/12/07 0012
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class mainData {
    private static final mainData ourInstance = new mainData();

    public static mainData getInstance() {
        return ourInstance;
    }
    private int sum=0;
    private int initData=10;
    private int coin_numbers;
    private int[] card_record;
    private int addNumbers;
    private Random random;
    int randNumber;
   private String update;
 updateTime updateTime;

/**
*@Date: 2018/12/17 0018
*@Author:Cillivian
*@Description:设置页面数据
*/
    private mainData() {
        coin_numbers=0;
        card_record =new int[21];
        for(int i=0;i<21;++i)
            card_record[i]=0;
        addNumbers=0;


    }

    public String getTime(){
updateTime=new updateTime();
        return this. updateTime.getTime();
    }

    public void setAddNumbers() {
        int temp=0;
        for(int i=0;i<21;++i)
            if(card_record[i]==1)
               ++temp;
        this.addNumbers = temp;
        random=new Random();
        int  t = random.nextInt(7) +2;//生成随机变量
        this.sum+=t;
        this.randNumber=t;
    }

    public int getAddNumbers() {
        return addNumbers;
    }

    public void setCard_recordOne(int place) {
        card_record[place]=1;
    }
    public void addCoins(){

        coin_numbers=initData+this.sum;

    }

    public void setCoin_numbers(int coin_numbers) {
        this.coin_numbers = coin_numbers;
    }

    public void setCard_record(int[] card_record) {
        this.card_record = card_record;
    }

    public  int getRandNumber(){
        return randNumber;
    }
    public int getCoin_numbers() {
        return coin_numbers;
    }

    public int[] getCard_record() {
        return card_record;
    }
}
