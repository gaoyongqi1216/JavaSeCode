package com.gyq1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.gyq1.one.exer2
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/21 12:30
 * @Version 1.0
 */
public class ArrayExer02 {
    /**
    案例：输出英文星期几

    用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
    {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

    拓展：一年12个月的存储

    用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
    {"January","February","March","April","May","June","July","August","September","October","November","December"}
     */
    public static void main(String[] args) {
        String[] week1 = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值（1-7：");
        int i = scanner.nextInt();
        if(i <1 || i > 7){
            System.out.println("您输入的数值有误！");
        }else{
            System.out.println(week1[i -  1]);
        }
        scanner.close();
    }
}
