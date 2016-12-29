package com.ltiger.viewinject;

import android.app.Activity;

/**
 * author : tiger
 * email  : liuxh@lovewith.me
 * time   : 16-12-29 下午3:08
 */

public class InjectView {
    public static void bind(Activity activity){
        String clsName = activity.getClass().getName();
        try {
            Class<?> viewBindingClass = Class.forName(clsName + "$$ViewBinder");
            ViewBinder viewBinder = (ViewBinder)viewBindingClass.newInstance();
            viewBinder.bind(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
