package com.gyq4.search_sort.exer2;

/**
 * ClassName: BinarySearchTest
 * Package: com.gyq4.search_sort.exer2
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 18:25
 * @Version 1.0
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};

        //二分查找
        int target = 5;

        int head = 0;//默认的首索引
        //默认的尾索引
        int end = arr2.length - 1;

        while (head <= end){
            int middle = (head+end) / 2;
            if(target == arr2[middle]){
                System.out.println("找到了"+target+",对应的位置为："+middle);
                break;
            }else if(target > arr2[middle]){
                head = middle + 1;
            }else {
                end = middle - 1;
            }
        }
    }
}
