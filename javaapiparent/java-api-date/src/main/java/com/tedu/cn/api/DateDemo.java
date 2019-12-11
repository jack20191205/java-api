package com.tedu.cn.api;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    @Test
    public void m1(){
        //获取日历对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
    @Test
    public void m2(){
        Date date=new Date();
        System.out.println(date);
        //返回1970年1月1日 00点到现在的毫秒数
        System.out.println(date.getTime());
        //将给定的毫秒数转化为日期对象
        Date d1=new Date(1575428192766L);
        System.out.println(d1+"*****");
        System.out.println(d1.before(date));
        /**
         * 4天 Linux操作系统  Cenos7.0
         */
    }

    /**
     * 测试日期格式化
     */
    @Test
    public void m3(){
        //将具体的日期转化为字符串
        SimpleDateFormat format=new SimpleDateFormat("yyyy年-MM月-dd日 hh:mm:ss");
        String date=format.format(new Date());
        System.out.println(date);

    }
    @Test
    public void m4() throws ParseException {
        /**
         * 字符串转日期
         */
        String date="2019.12.04";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
        Date d=sdf.parse(date);
        System.out.println(d);
    }
}
