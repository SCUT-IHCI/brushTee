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
    private int DAY=21;
    private Random random;
    private int sum=0;
    private int initData=10;
    private int coin_numbers;
    private int[] card_record;
    private int addNum;
    int randNumber;
 updateTime updateTime;

/**
*@Date: 2018/12/07 0018
*@Author:Cillivian
*@Description:设置页面数据
*/
    private mainData() {
        coin_numbers=0;
        card_record =new int[DAY];
        for(int i=0;i<DAY;++i)
            card_record[i]=0;
       addNum=0;


    }
/**
*@Date: 2018/12/10 0019
*@Author:Cillivian
*@Description:获取系统当前时间
*/
    public String getTime(){
updateTime=new updateTime();
        return this. updateTime.getTime();
    }

    public void setSum() {
        int temp=0;
        for(int i=0;i<DAY;++i)
            if(card_record[i]==1)
               ++temp;
        this.addNum = temp;
        random=new Random();
        int  t = random.nextInt(7) +2;//生成随机变量
        this.sum+=t;
        this.randNumber=t;
    }


//记录打卡
    public void setOneCard(int coordinate) {
        card_record[coordinate]=1;
        //记录
    }
    public void addCoins(){

        coin_numbers=initData+this.sum;//叠加获得星星数量

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
