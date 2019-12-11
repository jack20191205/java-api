package com.tedu.cn.api;

import org.junit.Test;

public class StringBuilderDemo {
    @Test
    public void m1(){
        /**
         *A mutable sequence of characters.  This class provides an API compatible
         *  * with {@code StringBuffer}, but with no guarantee of synchronization.
         */
        StringBuilder builder=new StringBuilder();
        //append方法
        builder.append("I love you ");
        builder.append(2019);
        builder.append(" will be end");
        System.out.println(builder.toString());

    }
    @Test
    public void m2(){
       StringBuilder builder=new StringBuilder("I love you");
       builder.append(2019);
       builder.append(" I hate you");
        System.out.println(builder.toString());
        builder.replace(builder.indexOf("hate"),builder.indexOf("hate")+"hate".length(),"love");
        System.out.println(builder.toString());
        //删除
        builder.delete(builder.indexOf("2019"),builder.indexOf("2019")+"2019".length());
        System.out.println(builder.toString());

    }

    public void tip(){
        /**
         * StringBuider 和StringBuffer的区别
         * StringBuilder是非线程安全的可变字符串类，运行效率较高，但是不能保证线程安全
         * StringBuffer也是一个可变字符串类，但是运行效率较低，线程安全
         */
    }
}
