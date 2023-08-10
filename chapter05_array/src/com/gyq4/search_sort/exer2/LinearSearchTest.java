package com.gyq4.search_sort.exer2;

/**
 * ClassName: LinearSerrchTest
 * Package: com.gyq4.search_sort.exer2
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 18:18
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int target = 5;
        //1.线性查找
        boolean  isFlag = true;
        for (int i = 0;  i < arr1.length; i++) {
            if(target == arr1[i]){
                System.out.println("找到了"+target+",对应的位置为："+i+1);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("没有找到！");
        }
    }
}
