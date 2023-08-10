package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:26
 */
public class Phone {

    //属性
    String name;
    double prices;//价格

    //方法
    public void call(){
        System.out.println("手机可以打电话！");
    }
    public  void senMessage(String message){
        System.out.println("发送短信："+message);
    }

    public void playGame(){
        System.out.println("玩手机！");
    }
}
