package com.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Package: com.atguigu01.example
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/22 10:23
 * @Version 1.0
 */
public class ReflectionTest {
    /*
        使用反射之前
     */
    @Test
    public void test1(){
        //1.创建Person类的实列
        Person p1 = new Person();

        //2.调用属性
        p1.age = 10;
        System.out.println(p1.age);

        //3.调用方法
        p1.show();
    }
    /*
        使用反射
     */
    @Test
    public void test2() throws Exception{
        //1.创建Person类的实列
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();

        //2.调用属性
        Field field = clazz.getField("age");
        field.set(person,10);
        System.out.println(field.get(person));

        //3.调用方法
        Method show = clazz.getMethod("show");
        show.invoke(person);

    }
    /*
    出了Person类之后，就不能直接调用Person类的声明的私有的构造器和属性
    但是可以通过反射的方式调用
     */
    @Test
    public void test3() throws Exception{
        //调用私有的构造器
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person Person = cons.newInstance("tom", 10);
        System.out.println(Person);

        //2.调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(Person,"Tom2");
        System.out.println(name.get(Person));

        //3.调用私有的方法
        Method method = clazz.getDeclaredMethod("showNation",String.class);
        method.setAccessible(true);
        String invoke = (String)method.invoke(Person, "中国");
        System.out.println(invoke);

    }
}
