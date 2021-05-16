package com.mf.study02;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author mf
 * @create 2021-05-16-12:37
 */
//练习反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.mf.study02.Student02");
        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //获取注解的值
        TableMafu tableMafu = (TableMafu) c1.getAnnotation(TableMafu.class);
        System.out.println(tableMafu.value());

        //获得类指定注解
        Field f = c1.getDeclaredField("name");
        FieldMafu fileName = f.getAnnotation(FieldMafu.class);
        System.out.println(fileName.columnName());
        System.out.println(fileName.type());
        System.out.println(fileName.length());


    }
}
@TableMafu("tb_student")
class Student02{
    @FieldMafu(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldMafu(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldMafu(columnName = "db_name",type = "varchar",length = 3)
    private String name;
    public Student02() {

    }
    public Student02(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableMafu{
    String value();
}
//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldMafu{
    String columnName();
    String type();
    int length();
}