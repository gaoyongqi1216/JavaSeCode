package com.atguigu05.method_more._03valuetransfer;

import com.atguigu02.memory.Person;

/**
 * ClassName: ValueTransferTest1
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/27 12:01
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test1 = new ValueTransferTest1();
        //1. 对于基本数据类型的变量来说
        int m = 10;

        test1.method1(m);
        System.out.println("m = "+m);

        //2. 对于引用数据类型的变量来说
        Person p = new Person();
        p.age = 10;
        test1.method2(p);

        System.out.println(p.age);
    }
    public void  method1(int m){
        m++;
    }

    public void method2(Person p){
        p.age++;
    }
}

