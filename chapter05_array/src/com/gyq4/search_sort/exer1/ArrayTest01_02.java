package com.gyq4.search_sort.exer1;

import java.util.Arrays;

/**
 * ClassName: ArrayTest01_02
 * Package: com.gyq4.search_sort.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 18:11
 * @Version 1.0
 */
public class ArrayTest01_02 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        //现需删除数组中索引为4的元素  还需要使其紧密排列
        int deleteIndex = 4;
        //方式1 不新建数组
      /*  for(int i=deleteIndex;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        //修改最后元素，将其是为默认值
        arr[arr.length-1] = 0;
        System.out.println(Arrays.asList(arr));*/

        //方式2 新建数组，新的数组的长度比原有的长度少1个
        int[] newArray = new int[arr.length-1];
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = arr[i];
        }
        for (int i = deleteIndex; i < arr.length-1; i++) {
            newArray[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
