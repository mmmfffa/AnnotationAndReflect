package com.mf.study02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author mf
 * @create 2021-05-16-11:51
 */
//通过反射动态创建对象
public class Test09 {
    public static void main(String[] args) throws Exception {
        //1.获得class对象
        Class c1 = Class.forName("com.mf.study02.User");
        //2.创建一个对象实例
//        User user =(User) c1.newInstance();
//        System.out.println(user);//本质是调用无参构造器

        //3.通过构造器创建对象
//        Constructor constructor = c1.getConstructor(String.class, int.class, int.class);
//        User mafu =(User) constructor.newInstance("mafu", 1, 10);
//        System.out.println(mafu);

        //4.通过反射调用普通方法
        User user3 =(User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"马富");//激活 对象，“方法值”
        System.out.println(user3.getName());

        //5.通过反射操作属性
        User user4 =(User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性
        name.setAccessible(true);//字端检测,true关闭
        name.set(user4,"马富2");
        System.out.println(user4.getName());


    }
}
