package com.mf.study02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author mf
 * @create 2021-05-16-11:22
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c1 = Class.forName("com.mf.study02.User");
//        User user = new User();
//        c1 = user.getClass();
        //1.获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println("=======================================");
        //2.获得类的属性
        Field[] fields = c1.getFields();//只能找public
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        fields=c1.getDeclaredFields();//找到全部属性
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=======================================");
        //3.获得类的方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的:"+method);//获得本类及其父类
        }
        methods=c1.getDeclaredMethods();//获得本类
        for (Method method : methods) {
            System.out.println("Declared的:"+method);
        }

        System.out.println("=======================================");
        //4.获得类的指定方法
        //重载
        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        System.out.println("=======================================");
        //5.获得类的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("#"+constructor);
        }
        constructors=c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("=======================================");
        //6.获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}
