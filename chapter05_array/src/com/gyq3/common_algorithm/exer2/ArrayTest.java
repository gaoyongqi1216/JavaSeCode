package com.gyq3.common_algorithm.exer2;

/**
 * ClassName: ArrayTest
 * Package: com.gyq3.common_algorithm.exer2
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 15:22
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,4,6,8,9,0,1,2,7,3};

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
        sum = (sum-max-min)/8;
        System.out.println("最后得分："+sum);
    }
}
