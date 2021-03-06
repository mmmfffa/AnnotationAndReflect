package com.mf.study02;

/**
 * @author mf
 * @create 2021-05-16-9:49
 */
//测试类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person);
        //方式一：通过对象获得
        Class c1= person.getClass();
        System.out.println(c1.hashCode());
        //方式二: forName
        Class c2= Class.forName("com.mf.study02.Student");
        System.out.println(c2.hashCode());
        //方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        //方式四： 基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4.hashCode());
        System.out.println(c4);
        //获得父类的类型
        Class c11 = c1.getSuperclass();
        System.out.println(c11);

    }
}
//实体类 :pojo entity
class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student() {
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name="老师";
    }
}