package com.scy.demo1;

/**
 * 类名： demo1 <br>
 * 描述：++ i 可以分为：++ 局部变量+1, 然后i再压入栈 <br>
 *      i++ 分为： i压入栈，局部变量++,再将栈赋值<br>
 * 创建日期： 2018/11/20 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class demo1 {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
//        int k = i + ++i * i++;
        int k = i + i++ * ++i;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}
