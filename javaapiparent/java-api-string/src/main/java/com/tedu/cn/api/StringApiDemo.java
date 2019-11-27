package com.tedu.cn.api;

import org.junit.Test;


public class StringApiDemo {
    /**
     * 创建String对象的方式有两种；
     * 1)通过字符串的字面量取创建字符串对象
     * 2）通过String的构造器去创建对象
     * 注意：String字符串字面量创建出来的
     * 对象会被放入常量池，第二次再次使用
     * String字符串字面量创建的是Java会去
     * 常量池中查找有没有对象的字符串字面量 对象
     * 如果有 ，则直接使用，没有 则创建并且放入常量池。
     * 如果是通过new 关键字创建的，那么就会生成一个全新的
     * 对象。
     */
    @Test
    public void testString001(){
      //测试第一种方式创建String对象
        String str1="abc";
        String str2="abc";
        String str3= "abc";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
    /**
     * 测试字符串对象的trim API的使用。
     *源码描述如下：
     * Returns a string whose value is this string, with any leading and trailing
     *  whitespace removed.
     *    返回取出字符串作用两边的空格的的字符串
     */
    @Test
    public void testTrim(){
        String str1="      8***************8      ";
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);
    }
    /**
     * 将某一个字符串全部字符全部转化为大写使用toUpperCase
     * 转化为小写使用toLowerCase
     */
    @Test
     public void testLetterCHG(){
        String str1="i love you";
        str1=str1.toUpperCase();
        System.out.println(str1);
        System.out.println(str1.toLowerCase());//转化为小写
     }

    /**
     * 使用 indexOf查找一个字符串某一个字串的索引（下标值 从0开始）在字符串中第一次出现的
     * 索引
     */
    @Test
    public void testIndexOf(){
        String str1="I love you,my girl";
        System.out.println(str1.indexOf("m"));
        System.out.println(str1.indexOf("o"));
        /**
         * lastIndexOf表示最有一个字符串在字符串中出现的索引
         */
        System.out.println(str1.lastIndexOf("o"));
    }

}
