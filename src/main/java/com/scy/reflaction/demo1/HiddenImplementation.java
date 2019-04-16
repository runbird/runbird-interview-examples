package com.scy.reflaction.demo1;

import com.scy.reflaction.demo1.apis.A;
import com.scy.reflaction.demo1.impl.HiddenC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类名： HiddenImplementation <br>
 * 描述：TODO <br>
 * 创建日期： 2019/4/16 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class HiddenImplementation {

    public static void main(String[] args) throws Exception{
        A a = HiddenC.createA();
        a.funcADefault();

        System.out.println(a.getClass().getName());
        callHiddenMethod(a,"funcPublic");
        callHiddenMethod(a,"funcProtected");
        callHiddenMethod(a,"funcCDefault");
        callHiddenMethod(a,"funcPrivate");
    }

    static void callHiddenMethod(Object obj, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = obj.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);
    }
}
