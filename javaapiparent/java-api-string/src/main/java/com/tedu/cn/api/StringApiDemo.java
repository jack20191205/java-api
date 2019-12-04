package com.tedu.cn.api;

import org.junit.Test;

import java.io.UnsupportedEncodingException;


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
     * 如果是通过new 关键字创建的，那么就会生成一个gbb全新的
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
    @Test
    public void testContains(){
        /**
         * 测试API contains
         *
         * returns true if and only if this string contains the specified
         * sequence of char values.
         *
         *  @param s the sequence to search for
         * @return true if this string contains {@code s}, false otherwise
         * @since 1.5
         *
         */
        String str="I love you!";
        boolean f=str.contains("love");
        System.out.println(f);
    }

    /**
     * 拼接两个字符串
     */
    @Test
    public void testConcat(){
        /**
         * Concatenates the specified string to the end of this string.
         */
        String str1="I love ";
        str1=str1.concat("you");
        System.out.println(str1);
    }
    @Test
    public void  testEndWithAndStartWith(){
        /**
         * 测试字符串是否一某一后缀结尾，如果是返回true,否则返回false
         */
        String str1="I love you";
        System.out.println(str1.endsWith("ou"));
    }
    @Test
    public void testUpperCase(){
        /**
         * 将字符串转化为大写字符
         */
        String str="tts.cn";
        System.out.println(str.toUpperCase());
    }
    @Test
    public void testEqualsAndIgnoreCase(){
        /**
         * 源码的算法如下：
         *   if (this == anObject) {
         *             return true;
         *         }
         *         if (anObject instanceof String) {
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         */
        String str1="abc";
        String str2="abc";
        String str3="ABC";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
    @Test
    public void testGetBytes() throws UnsupportedEncodingException {
        /**
         * 将给定字符串转化为byte数组
         */
        byte[] bs="I love you".getBytes("UTF-8");
        for (int i = 0; i <bs.length ; i++) {
            System.out.println(bs[i]);
        }
    }
    @Test
    public void testSubString(){
        String str="I love you!";
        /**
         * substring底层算法如下：
         * if (beginIndex < 0) {
         *             throw new StringIndexOutOfBoundsException(beginIndex);
         *         }
         *         if (endIndex > value.length) {
         *             throw new StringIndexOutOfBoundsException(endIndex);
         *         }
         *         int subLen = endIndex - beginIndex;
         *         if (subLen < 0) {
         *             throw new StringIndexOutOfBoundsException(subLen);
         *         }
         *         return ((beginIndex == 0) && (endIndex == value.length)) ? this
         *                 : new String(value, beginIndex, subLen);
         */
        /**
         * 取字符串的子字符串，由两个重载的API
         * substring(index)
         * substring(index,endindex)
         */
        System.out.println(str.substring(2,6));
        /**
         * dasfadsfadsfjadsklfhadskl343245234523525lkdfhaklfhdakjfhadskjfhsadjfadsfasdfk
         * fasdfjfkwww.baidu.comadshf
         */
        String src="dasfadsfadsfjadsklfhadskl343245234523525lkdfhaklfhdakjfhadskjfhsadjfadsfasdfk\n" +
                "         * fasdfjfkwww.baidu.comadshf";
        String d="www.baidu.com";
        System.out.println(src.substring(src.indexOf(d),src.indexOf(d)+d.length()));

    }

}
