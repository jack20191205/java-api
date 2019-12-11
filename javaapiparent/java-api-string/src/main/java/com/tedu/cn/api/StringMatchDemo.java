package com.tedu.cn.api;

import org.junit.Test;

public class StringMatchDemo {
    @Test
    public void m1(){

        /**
         * 基本匹配规则：
         * [a-z]表示a到z中的任何一个字符
         * [0-9]表示0到9中的任意一个数字
         */
        String regex="[a-z]";
        System.out.println("a".matches(regex));
        regex="[a-zA-Z0-9]";
        System.out.println("-".matches(regex));
        regex="[^(a-zA-Z0-9)]";
        System.out.println("-".matches(regex));

    }

    /**
     * 测试预定义字符集
     */
    @Test
    public void m2(){
        /**
         *  . 表示任意一个字符
         *  \d 表示任意一个数字字符   相当于[0-9]
         *  \w 表示任意一个单词字符 相当于[a-zA-Z0-9_]中的任意一个
         *  \s 表示任意一个空白字符
         *  \D 任意非数字字符
         *   \W 任意一个非单词字符
         *   \S 任意一个非空白字符
         */
        /**
         * 数量词：
         *  X？ 表示前面的X出现0次或者1次
         *  X+ 表示前面的X出现1次或者多次
         *  X* 表示前面的X出现0次或者多次
         *  X{n} 表示前面的X刚好出现那次
         *  X{n,} 表示前面的X至少出现n次
         *  X{m,n} 表示前面的X出现m次 到n次之间 包含n
         */
        String reg="\\d";
        System.out.println("------------info--------------");
        System.out.println("9".matches(reg));
        System.out.println("98".matches(reg));
        reg="\\d+";
        System.out.println("------------info--------------");
        System.out.println("98".matches(reg));
        reg="\\d*";
        System.out.println("------------info--------------");
        System.out.println("98".matches(reg));
        reg="\\d?";
        System.out.println("------------info--------------");
        System.out.println("98".matches(reg));
        System.out.println("9".matches(reg));
        reg="\\d{5}";
        System.out.println("------------info--------------");
        System.out.println("88888".matches(reg));
        System.out.println("888868".matches(reg));
        reg="\\d{5,}";
        System.out.println("------------info--------------");
        System.out.println("88888".matches(reg));
        System.out.println("888868".matches(reg));
        reg="\\d{6,8}";
        System.out.println("------------info--------------");
        System.out.println("88888".matches(reg));
        System.out.println("888888".matches(reg));
        System.out.println("8888687".matches(reg));
        System.out.println("88886879".matches(reg));
        System.out.println("888868799".matches(reg));
    }


    /**
     * 匹配手机号码
     */
    @Test
    public  void m3(){
        String regex="(\\+86)?\\s?\\d{11}";
        String phone="+8613595672347";
        if(phone.matches(regex)){
            System.out.println("手机号合法");
        }else {

            System.out.println("手机号码非法");
        }
    }
}
