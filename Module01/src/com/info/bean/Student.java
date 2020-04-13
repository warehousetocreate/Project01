package com.info.bean;

import java.util.ArrayList;

/**
 * @author Mr Tang
 * @create 2020-04-11 10:10
 */
public class Student extends Person{

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("Student.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 10;
        System.out.println("num2 = " + num2);
        System.out.println(num2);

        //模版三
        String[] arr = new String[]{"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void method(){
        System.out.println("Student.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {
            
        }
        if (list != null) {
            
        }
    }
}
