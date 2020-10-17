package com.demo;

import java.awt.*;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("before new Point()");

        new Point();

        System.out.println("after new Point()");

        try {
            Class.forName("Line");
        } catch (Exception e){
            e.printStackTrace();
        }

        Point pt = new Point();
        Class c1 = pt.getClass();
        System.out.println(c1.getName());

//        try {
//            Class c2 = Class.forName("Point");
//            System.out.println(c2.getName());
//            Point pp = (Point) c2.newInstance();
//            pp.output();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }


}
