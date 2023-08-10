package com.gyq4.search_sort.exer1;

import java.util.Arrays;

/**
 * ClassName: ArrayTest01_01
 * Package: com.gyq4.search_sort.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 18:00
 * @Version 1.0
 */
public class ArrayTest01_01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        //扩容一倍容量
//        int[] newArray = new int[arr.length << 1];
        //或
        int[] newArray = new int[arr.length * 2];

        //将现有元素复制到新的数组中国
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //将10,20,30三个数据添加
        newArray[arr.length]  = 10;
        newArray[arr.length+1]  = 20;
        newArray[arr.length+2]  = 30;

        //把新的指针赋值给原本数组
        arr = newArray;

        System.out.println(Arrays.toString(arr));
    }
}
