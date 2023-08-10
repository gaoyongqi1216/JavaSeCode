package com.gyq3.common_algorithm.exer5;

import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Package: com.gyq3.common_algorithm.exer5
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 15:37
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        System.out.println("反转之前："+ Arrays.toString(arr));
        //反转数组
        /*for (int i = 0; i < arr.length/2; i++) {
            //交换数组
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }*/
        //方式2
//        int[] newArray = new int[arr.length];
//        for (int i = arr.length-1; i >=0 ; i--) {
//            newArray[arr.length-1-i] = arr[i];
//        }
//        arr = newArray;
        //方式三
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("交换完之后的："+Arrays.toString(arr));
    }
}
