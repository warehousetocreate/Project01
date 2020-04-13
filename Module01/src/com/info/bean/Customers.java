package com.info.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Customers extends Person {

    private static final String STRING_SIZE = "123";
    private static int number2;

    public Customers() {
    }

    public static void main(String[] args) {
        //region Description
        System.out.println("HelloWorld!!!!");
        getArrayList();
    }

    public static void getArrayList() {
        ArrayList list = new ArrayList();
        Date date = new Date();
        list.add(0, 123);
        //endregion
        System.out.println(list);
    }

    public void eat() {
        System.out.println("客户吃饭！");
    }

    public static void method_01() {
        number2 = 1;
        System.out.println("HelloWorld!!!!");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
