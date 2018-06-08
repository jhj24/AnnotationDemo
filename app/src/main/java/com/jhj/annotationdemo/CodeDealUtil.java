package com.jhj.annotationdemo;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by jhj on 18-6-8.
 */

public class CodeDealUtil {

    public void register(Object o) {
        Class<?> clazz = o.getClass();
        Method[] method = clazz.getDeclaredMethods();
        if (method == null)
            return;
        for (Method m : method) {
            if (m.isAnnotationPresent(CodeDeal.class)) {
                CodeDeal deal = m.getAnnotation(CodeDeal.class);
                Log.w("key", deal.key());
                Log.w("value", deal.value());
            }
        }
    }

}
