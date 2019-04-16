package com.scy.concurrency;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 类名： SimpleDateFormateDemo <br>
 * 描述：TODO <br>
 * 创建日期： 2018/12/17 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class SimpleDateFormateDemo2 {


    public static void main(String[] args) throws InterruptedException {
        //解析日期
        String dateStr = "2016年10月25日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");
        String nowStr = now.format(format);
        System.out.println(nowStr);
    }
}
