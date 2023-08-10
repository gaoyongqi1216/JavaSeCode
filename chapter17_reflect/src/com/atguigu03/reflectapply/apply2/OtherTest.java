package com.atguigu03.reflectapply.apply2;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author shkstart
 * @create 14:45
 */
public class OtherTest {

    //（熟悉）获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型等
    //1. 获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class superclass = clazz.getSuperclass();//不带泛型的父类
        Type genericSuperclass = clazz.getGenericSuperclass();

        System.out.println(superclass);
        System.out.println(genericSuperclass);
    }
    //2. 获取运行时类实现的接口
    @Test
    public void test2() throws Exception{
        Class clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class[] interfaces = clazz.getInterfaces();
        for(Class c:interfaces){
            System.out.println(c);
        }
    }
    //3. 获取运行时类所在的包
    @Test
    public void test3() throws Exception{
        Class clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
    //4. 获取运行时类的带泛型的父类
    @Test
    public void test4(){

    }

    //5. 获取运行时类的父类的泛型 (难)
    @Test
    public void test5() throws Exception{
        Class clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        //1.获取带泛型的父类（type是一个接口 class实现了该接口）
        Type superclass = clazz.getGenericSuperclass();
        //2.如果父类时带泛型的，则可以强转为ParameterizedType
        ParameterizedType paramType = (ParameterizedType)superclass;
        //3.调用getActualTypeArguments()获取泛型的参数，结果是一个数组，因为可能有多个泛型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        //获取泛型参数的名称
        System.out.println(actualTypeArguments[0]);
    }


}
