package com.mf.study01;

import java.lang.annotation.*;

/**
 * @author mf
 * @create 2021-05-15-19:21
 */
//测试元注解
@MyAnnotation
public abstract class MetaAnnotation {

     public abstract void test();
}
//定义一个注解
//@Target表示我们的注解可以放在那里
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//@Retention表示我们的注解在什么时候生效
//RUNTIME>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
//是否生成注解在JavaDoc文档中
@Documented
@Inherited
@interface
MyAnnotation{

}