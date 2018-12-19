package com.cillivian.brushtee.controller;
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
public class MainActivityController {
    private static final MainActivityController ourInstance = new MainActivityController();

    public static MainActivityController getInstance() {
        return ourInstance;
    }

    private MainActivityController() {
    }
    /**
    *@Date: 2018/12/10 0018
    *@Author:Cillivian
    *@Description:
    */
    public static List<Activity> activities = new ArrayList<Activity>();


    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void clearActivity(Activity activity){
        activities.clear();
    }
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
