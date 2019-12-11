package com.tedu.cn.api;


import com.tedu.cn.api.ex.PasswordException;
import org.junit.Test;

import java.io.*;

public class PackageDemo {
    @Test
    public void m1(){
        /**
         * 包装类:
         * java语言为每一种基本数据类型都提供了
         * 一个包装类，类型的映射如下：
         * byte  -----Byte
         * short  --->Short
         * int  ---->Integer
         * long ---->Long
         * double --->Double
         * float----->Float
         * char --->Character
         * boolean --->Boolean
         * 这些对应的包装类都实现了一个接口叫做Serilizable接口（可序列化接口）
         * 表这些类能够进行序列化和反序列化
         */
        byte b0=1;
        Byte b1=new Byte(b0);
        System.out.println(Byte.MIN_VALUE);
        Integer i=1;//int i=1;
        System.out.println(Integer.toHexString(500));
        int b=1;
        Integer c=b;
        int d=c;

    }
    /**
     * java异常体系
     * 异常：程序不正常的退出
     * java语言的异常分为两种
     * 1)Error
     *  硬件故障（磁盘损坏，内存空间不住，断电）
     * 2)Exception
     * 是由于Java程序出的异常
     *     该异常又分为两种：
     *     1、编译时异常
     *     2、运行时异常
     *
     */
    /**
     * 测试Exception异常
     * 出现异常处理的两种方式
     * 1)通过thorws 显示抛出（在方法的屁股后面 添加 throws 异常类型），抛给方法的调用者
     * 2）通过try  catch语句
     * 进行显示的捕获
     */
    @Test
    public void m2(){

          try{
              min();

          }catch (Exception e){

          }



    }
    public static void min() throws FileNotFoundException {
        InputStream inputStream= new FileInputStream("tts.txt");
    }
    @Test
    public void m5(){
        ex();
    }
    public static void ex(){
          try{
              File f=new File("tsss.txt");

              InputStream inputStream=new FileInputStream(f);//可能发生异常
             System.out.println(1/1);
              String str="cccc";
              System.out.println(str.lastIndexOf("c"));
          }catch (ArithmeticException f2){
              System.out.println("除数不能为0");
          }catch (NullPointerException f3){
              System.out.println("出现空指针异常");
          }catch (FileNotFoundException f1){
              System.out.println("文件未找到");
              try {
                  f1.printStackTrace(new PrintStream("ttx.txt").append("文件未找到异常"));
              } catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
          } catch (IOException e) {
              System.out.println("文件读取异常");
          }finally {
              System.out.println("程序执行了");
          }
    }
    @Test
    public void m6(){
        try {
            autoEx();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void autoEx() throws Exception {


        throw new Exception("我创建的异常");
    }
    /**
     * 运行时异常 RuntimeException
     * 不需要显示抛出或者捕获
     */
    public static void mmm1(){
        RuntimeException r=new RuntimeException("出现了运行时异常");
        throw r;
    }
    @Test
    public void m7(){
        mmm1();
    }
   @Test
    public void m8(){
        String pwd="123456";
        if(pwd.length()<8){
            throw  new PasswordException(2,"密码安全系数不够");
        }
        if(pwd.matches("\\d{4,8}&&\\w{4,8}")){
            throw new PasswordException(1,"密码不匹配");
        }
        if(!pwd.equals("asdfgh123")){
            throw  new PasswordException("密码错误");
        }
    }
}
