package com.gyq1.one;

/**
 * ClassName: OneArrayTest
 * Package: com.gyq1.one
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 10:49
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        //1. 数组的声明和初始化

        //1.1声明数组
        double[] prices;
        //1.2 初始化数组
        //静态初始化(数组变量的复制与数组元素的复制操作同时进行的）
        prices = new double[]{20,32,55,87};

//        String[] foods;
//        foods = new String[]{"鱼香肉丝","龙须菜","狮子头","玉兰片"};
        //数组的声明与初始化
        //动态初始化
        String[] foods = new String[4];

        // 其他正确的方式
//        int arr0[] = new int[4];
//        //类型推断只能写一行
//        int[] arr1 = {1,223,3,4};

        //2. 调用数组的指定元素
        //通过角标的方式去获取指定元素
        System.out.println(prices[0]);
        System.out.println(prices[1]);

        foods[0] = "鱼香肉丝";
        foods[1] = "龙须菜";
        foods[2] = "狮子头";
        foods[3] = "玉兰片";

        //3. 数组的属性：length,表示数组的长度 （用来描述数组容器中容量的大小）
        System.out.println(foods.length);
        System.out.println(prices.length);

        //4. 数组的遍历
        for (int i = 0;i < foods.length;i++){
            System.out.println(foods[i]);
        }
    }
}
