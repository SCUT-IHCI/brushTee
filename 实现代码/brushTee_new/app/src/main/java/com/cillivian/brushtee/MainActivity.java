package com.cillivian.brushtee;
import android.app.Activity;
import java.util.List;
import java.util.ArrayList;
/**
 * Time:2018/12/10 0018
 * <p>
 * Author:Cillivian
 * <p>
 * Description:
 */
public class MainActivity {
    private static final MainActivity ourInstance = new MainActivity();

    public static MainActivity getInstance() {
        return ourInstance;
    }

    private MainActivity() {
    }
    /**
    *@Date: 2018/12/10 0018
    *@Author:Cillivian
    *@Description:定义activity的状态
    */
    public static List<Activity> activities = new ArrayList<Activity>();


    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void close() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
