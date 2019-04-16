package com.scy.reflaction.demo1.impl;

import com.scy.reflaction.demo1.apis.A;

/**
 * 类名： C <br>
 * 描述：TODO <br>
 * 创建日期： 2019/4/16 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
class C implements A {

    @Override
    public void funcADefault() {
        System.out.println("public C.funcADefault()");
    }

    public void funcPublic() {
        System.out.println("public C.funcPublic()");
    }

    protected void funcProtected() {
        System.out.println("protected C.funcProtected()");
    }

    void funcCDefault() {
        System.out.println("package C.funcCDefault()");
    }

    private void funcPrivate() {
        System.out.println("private C.funcPrivate()");
    }
}

public class HiddenC {
    public static A createA() {
        return new C();
    }
}
