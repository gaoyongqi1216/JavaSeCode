

package com.atguigu03.field_method.method;

/**
 * @author 尚硅谷-宋红康
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(int hour){
        System.out.println("人要睡觉"+hour);
    }

    public String interests(String hobby){
        String info = "我的爱好"+hobby;
        System.out.println(info);
        return info;
    }



}