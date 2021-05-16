package com.mf.study02;

/**
 * @author mf
 * @create 2021-05-16-10:36
 */
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
        /*
        1.加载到内存，会产生一个类对应class对象
        2。链接，链接后m=0
        3.初始化，合并静态代码块
            static {
                int m=100;
                System.out.println("A类静态代码块");
                m=300;
            }
            m=300
        * */
    }
}
class A{
    static int m=100;
    static {
        System.out.println("A类静态代码块");
        m=300;
    }

    public A() {
        System.out.println("A类的无参构造初始化");
    }
}
