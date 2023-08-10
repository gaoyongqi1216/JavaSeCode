package com.gyq3.common_algorithm.exer1;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: ArrayTest
 * Package: com.gyq3.common_algorithm.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 15:02
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1.先定义一个100以为的随机数
        Random random = new Random();
        //定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            int num=(int)(Math.random() * (99 - 10 + 1)) + 10;
            arr1[i]=num;
        }
        System.out.println(Arrays.toString(arr1));
        //1.最大值，最小值，总和，平均值，
        int max=arr1[0];
        int min=arr1[0];
        int sum=0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i]>max){
                max=arr1[i];
            }
            if(arr1[i]<min){
                min=arr1[i];
            }
            sum+=arr1[i]+arr1[0];
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("总和："+sum);
        System.out.println("平均值："+sum/arr1.length);
    }
}
