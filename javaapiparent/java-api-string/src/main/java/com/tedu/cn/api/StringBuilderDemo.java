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
}
