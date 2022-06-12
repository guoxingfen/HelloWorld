package com.atguigu.java;

import java.io.FileInputStream;
import java.util.ArrayList;

public class HelloWorld {

    public static int aaa=10;
    private int Num;

    public static void main(String[] args){
        test4();
//
        //        System.out.println("Hello World!!!");

/*jjjjj
djjdjdj*/
    }

    private static void test4() {
        ArrayList list=new ArrayList();
        list.add(0,123);
    }

    public  void test(){
        Num = 10;
        try {
            test4();
            FileInputStream file=new FileInputStream("xxx.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
