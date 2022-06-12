package com.atguigu.bean;

import java.util.ArrayList;

public class Customer extends Person {
    public static void main(String[] args){
        System.out.println("Module01 Test....");
        StringBuffer str=new StringBuffer();

        ArrayList list=new ArrayList();

    }

    public void test1(){
        System.out.println("测试！！！");
    }

    @Override
    public void eat() {
        System.out.println("客户吃饭");
    }
}
