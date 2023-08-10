package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:29
 */
public class PhoneTest {//是Phone的一个测试类
    public static void main(String[] args) {
        //创建Phone的对象
        Phone phone = new Phone();

        //通过phone的对象，调用其内部声明的属性或方法
        //格式：对象.属性
        phone.name="华为";
        phone.prices = 9999;
        System.out.println("手机的名字："+phone.name+",价格："+phone.prices);
        phone.senMessage("你好");
    }
}
