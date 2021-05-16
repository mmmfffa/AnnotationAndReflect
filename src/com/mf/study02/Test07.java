package com.mf.study02;

import sun.management.resources.agent;
import sun.tools.jar.resources.jar;

/**
 * @author mf
 * @create 2021-05-16-11:07
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获得系统类加载系
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器---》拓展类
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取拓展类加载器的父类---》根类加载器
        ClassLoader parentParent = parent.getParent();
        System.out.println(parentParent);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.mf.study02.Test07").getClassLoader();
        System.out.println(classLoader);
        //测试JDK内部的类是谁加载的
        ClassLoader classLoader2 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader2);

        //双亲委派机制

        //如何获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
/*        C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\charsets.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\deploy.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\dnsns.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\jaccess.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\localedata.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\nashorn.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\sunec.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\ext\zipfs.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\javaws.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\jce.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\jfr.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\jfxswt.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\jsse.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\management- agent.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\plugin.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\resources.jar;
          C:\Program Files\JavaJDK\jdk1.8.0_191\jre\lib\rt.jar;
          D:\IDEA\MyProject\KuangStudy\AnnotationAndReflect\out\production\AnnotationAndReflect;
          D:\IDEA\IntelliJ IDEA 2020.3\lib\idea_rt.jar*/

    }
}
