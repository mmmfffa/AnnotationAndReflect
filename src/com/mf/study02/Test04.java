package com.mf.study02;

import java.lang.annotation.ElementType;

/**
 * @author mf
 * @create 2021-05-16-10:05
 */
//所有类型的Class
public class Test04 {
    public static void main(String[] args) {
        Class c1 = Object.class;//类
        Class c2 = Comparable.class;//接口
        Class c3 = String[].class;//数组一维
        Class c4 = int[][].class;//数组二维
        Class c5 = Override.class;//注解
        Class c6 = ElementType.class;//枚举
        Class c7 = Integer.class;//基本类型
        Class c8 = void.class;//空类型
        Class c9 = Class.class;//Class类型

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        int[] a=new int[10];
        int[] b=new int[20];
        //只要元素类型和维度一样就是同一个Class
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());


    }
}
