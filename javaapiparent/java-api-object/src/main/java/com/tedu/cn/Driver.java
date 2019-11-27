package com.tedu.cn;

import com.tedu.cn.ob.Person;

public class Driver {
    public static void main(String[] args)
    {
        Person person1=new Person("Jack",18,'M',180,70);
        Person person2=new Person("Jack",18,'M',180,70);
        System.out.println(person1.equals(person2));
        System.out.println(person1);
    }
}
