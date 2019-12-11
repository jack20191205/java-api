package com.tedu.cn.api.file;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FiletTest {
    @Test
    public void m1() throws IOException {
        /**
         * File类是位于java.io.包下的一个类，通过该类
         * 可以操作本地磁盘的数据。但是不能读取文件的类容
         */
        File f=new File("files");
        //可以使用它exsists方法来检测某一个文件是否存在
        if(f.exists()){
            System.out.println("文件存在");
        }else {
            System.out.println("文件不存在");
            boolean flag=f.mkdir();
            System.out.println(flag?"创建成功":"创建失败");
        }
        f=new File(f,"ch.txt");
        if(f.exists()) {
            System.out.println("村子");
        }else {
            f.createNewFile();
        }
        System.out.println("当前系统的分隔符是："+File.separator);
    }

    /**
     * 相对路径：
     * 从自己本身的路径出发，找到目标文件的路径
     * 绝对路径：从根路径出发，直到找到目标文件的路径
     * 即可（比如：d:\\student/t.txt linux系统上面
     * 使用/表示根目录）凡是以http或者https开头的路径都是
     * 绝对路径
     * cd(change directory)
     *
     * 注意：在表示路径的时候一定不要将
     * 路径的分隔符写死
     */
    @Test
    public  void m2(){
       File f=new File("D:\\");
        /**
         * ifFile方法判断一个一个抽象路径是文件
         * 还是目录（文件夹）
         * 如果是文件返回true,否则返回false
         */
        System.out.println(f.isDirectory());
    }
    @Test
    public void m3(){
        /**
         * 使用length()API表示
         * 文件的长度  英文字母占用1字节
         * 中文占用2个字节
         */
        File f=new File("t.txt");
        System.out.println(f.length());
    }

    @Test
    public void m4() throws IOException {
        /**
         * 使用length()API表示
         * 文件的长度  英文字母占用1字节
         * 中文占用2个字节
         */
        File f=new File("t.txt");
        if(!f.exists()){

            System.out.println(f.createNewFile());
        }
    }
    @Test
    public void m5(){
        /**
         * mkdir()
         * mkdirs()
         */
        File f=new File("fs/ns1/ns2");
        if(!f.exists()){
            System.out.println(f.mkdirs());

        }
    }
    @Test
    public void m6(){
        File f=new File("new.txt");
        if(f.exists()){
            f.renameTo(new File("new1.txt"));

        }
        System.out.println(f.lastModified());
    }
    @Test
    public void m7(){
        File f=new File(
                "fs"+
                        File.separator+
                        "ns1"+File.separator+"ns2"+
                        File.separator+"mm.txt"
        ); //fs/ns1/ns2
        System.out.println(f.getParent());

    }
    @Test
    public void m8(){
        /**
         * 测试列出某一个目录下的所有文件或者目录
         */
        File f=new File("E:\\maven\\apache-maven-3.3.9");
        if(f.exists()){
            File[] fs=f.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory();
                }
            });
            for (int i=0;i<fs.length;i++){
                System.out.println(fs[i].getName());
            }
        }
    }
    @Test
    public void m9(){

         File f=new File("fs");
        //System.out.println(f.listFiles());
        System.out.println(reversDel(f));
    }
    static boolean f=false;
    public static boolean reversDel(File file){
        File[] fs=file.listFiles();

        if(fs.length>0){
            for (int i = 0; i <fs.length ; i++) {
                reversDel(fs[i]);
            }
        }
        if(fs.length==0){
            return  file.delete();
        }
        return false;

    }
}
