package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author guoxingfen
 * @create 2022-06-12 18:28
 */
public class TemplatesTest {
    //    模板：prsf  psf
//    变形：psfi  psfs
    private static final int NNN = 10;
    public static final String STR = "XXXX";

//    格式化代码：ctrl+alt+l  ctrl+shift+f

    /**
    * 客户的ID
    */
    private int ID;

//    模板：生成main方法-psvm  main




    public static void main(String[] args) {
//        模板：sout
//        变形：soutp soutv soutm xxx.sout
        System.out.println("sout模板");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        int num = 10;
        System.out.println("num = " + num);
        System.out.println("TemplatesTest.main");
        int nump = 10;
        System.out.println(nump);
        ArrayList arrxx = new ArrayList();
        arrxx.add(1);
        arrxx.add(2);
        arrxx.add(3);
        arrxx.add(4);
        arrxx.add(34);
//        模板：fori
//        变形：iter itar
        for (int i = 0; i < arrxx.size(); i++) {
            System.out.println(i);
        }
        for (Object o : arrxx) {

        }
//        模板：list.for
//        变形：list.fori  list.forr
        for (Object o : arrxx) {

        }
        for (int i = 0; i < arrxx.size(); i++) {

        }
        for (int i = arrxx.size() - 1; i >= 0; i--) {

        }
//        模板：ifn  inn
//        变形：xx.nn  xx.null
        if (arrxx == null) {

        }
        if (arrxx != null) {

        }
        if (arrxx != null) {

        }
        if (arrxx == null) {

        }
    }

    public void test01() {
        System.out.println("test01方法");
        try {
            FileInputStream file=new FileInputStream("xx.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void test02(){
        System.out.println();
        int num=10;
        System.out.println("num = " + num);
        System.out.println("TemplatesTest.test02");
        System.out.println(num);

    }
}
