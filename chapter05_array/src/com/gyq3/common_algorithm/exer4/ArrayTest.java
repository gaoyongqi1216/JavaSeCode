package com.gyq3.common_algorithm.exer4;

import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Package: com.gyq3.common_algorithm.exer4
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 15:29
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1.创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组
        int[] arr1,arr2;
        //2.使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19
        arr1=new int[]{2,3,5,7,11,13,17,19};
        //3.显示array1的内容
        System.out.println(Arrays.toString(arr1));
        //4.赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)
        arr2 = arr1;
        //复制一个数组
        arr2 = Arrays.copyOf(arr1,arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            if(i%2==0){
                arr2[i]=i;
            }
        }
        //换行
        System.out.println();
        //5.打印出array1
        System.out.println(Arrays.toString(arr1));
    }
}
