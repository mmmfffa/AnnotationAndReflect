package com.mf.study01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mf
 * @create 2021-05-15-20:37
 */
//自定义注解
public class DefineAnnotation {
    //注解可以显示赋值
    @MyAnnotation02(name = "mafu",schools = "湖南大学")
    public void test(){}

    //只有一个值，value命名可以省略
    @MyAnnotation03("mafu")
    public void test2(){}
}
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation02{
    //注解的参数：参数类型+参数名()
     String name() default "";
     int age() default 0;
     int id() default -1;//如果默认值为-1，代表不存在，indexOf,如果找不到就返回-1
     String[] schools() default {"湖南大学","中南大学"};
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03{
    String value();
}