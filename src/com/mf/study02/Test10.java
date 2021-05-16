package com.mf.study02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mf
 * @create 2021-05-16-12:10
 */
//分析性能问题
public class Test10 {
    //普通方式调用
    public static void test01(){
        User user = new User();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000_000; i++) {
            user.getName();
        }

        long end = System.currentTimeMillis();

        System.out.println("普通方式执行10亿此需要=》" + (end - start)+"ms");
    }
    //反射调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000_000; i++) {
            getName.invoke(user,null);
        }

        long end = System.currentTimeMillis();

        System.out.println("反射调用执行10亿此需要=》" + (end - start)+"ms");
    }
    //反射调用 关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName");
        getName.setAccessible(true);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000_000; i++) {
            getName.invoke(user,null);
        }

        long end = System.currentTimeMillis();

        System.out.println("关闭检测执行10亿此需要=》" + (end - start)+"ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
