package com.atguigu02._class;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * ClassName: ClassTest
 * Package: com.atguigu02._class
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/22 11:47
 * @Version 1.0
 */
public class ClassTest {
    /*
    获取Class实列的几种方式
     */
    @Test
    public void test1() throws Exception {
        //1.调用运行时类的静态属性：class
        Class<User> clazz1 = User.class;
        System.out.println(clazz1);

        //2.调用运行时类的对象的getClass()
        User user = new User();
        Class clazz2 = user.getClass();
        System.out.println(clazz2==clazz1);

        //3.调用Class的静态方法forName(String className)
        String className = "com.atguigu02._class.User";//全类名
        Class clazz3 = Class.forName(className);
        System.out.println(clazz1==clazz3);

        //4.使用类的加载器的方式
        Class<?> clazz4 = ClassLoader.getSystemClassLoader().loadClass("com/atguigu02/_class/User");
    }

    @Test
    public void test2() throws Exception{
        String str = "com.atguigu01.example.Person";
        Class clazz = Class.forName(str);

        Object obj = clazz.newInstance();

        Field field = clazz.getField("name");
        field.set(obj, "Peter");
        Object name = field.get(obj);
        System.out.println(name);

    }
}
