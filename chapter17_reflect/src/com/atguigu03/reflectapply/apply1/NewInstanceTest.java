package com.atguigu03.reflectapply.apply1;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

/**
 * ClassName: NewInstanceTest
 * Package: com.atguigu03.reflectapply.apply1
 * Description:
 *          反射的应用一：创建运行时类的对象
 * @Author gyq
 * @Create 2023/7/23 10:05
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws Exception{
        Class<Person> clazz = Person.class;

        //创建Person的实列
        Person person = clazz.newInstance();

    }
}
