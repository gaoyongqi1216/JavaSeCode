package com.atguigu05.method_more._01overload;

/**
 * ClassName: OverLoagTest
 * Package: com.atguigu05.method_more._01overload
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/25 19:56
 * @Version 1.0
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest o = new OverLoadTest();
        o.add(10,10);
    }

    public void  add(int i,int j){
        System.out.println("int");
    }
    public void add(double i,double j){
        System.out.println("double");
    }

    public void add(int i,int j,int k){

    }

    public void  add(String s1,int i){

    }
    //不同顺序也是重载
    public void  add(int i,String s1){

    }
}
