package com.gyq4.search_sort.exer3;

import java.util.Arrays;

/**
 * ClassName: BubblingSort
 * Package: com.gyq4.search_sort.exer3
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 18:36
 * @Version 1.0
 */
public class BubblingSort {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            boolean isFlag = true; //假设数组是有序的
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isFlag = false;
                }
            }
            if(isFlag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
