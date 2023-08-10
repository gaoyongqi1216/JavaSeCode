package com.atguigu05.method_more._04recursion;

/**
 * @author 尚硅谷-宋红康
 * @create 16:57
 */
public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest recursionTest =new RecursionTest();
//        recursionTest.method1();
        int sum = recursionTest.getSum(100);
        System.out.println(sum);
        int mul = recursionTest.getMul(5);
        System.out.println(mul);
        System.out.println(recursionTest.f(10));
        System.out.println(recursionTest.method(10));
    }

    public void method1(){
        System.out.println("method1---");
        method1();
    }

    /**
     * 举例1 ； 计算 1-100 内的自然数
     */
    public int getSum(int sum){
        if (sum == 1){
            return 1;
        }
        return sum+getSum(sum - 1);
    }

    /**
     * n!
     * @param n
     * @return
     */
    public int getMul(int n){
        if(n==1){
            return 1;
        }
        return n*getMul(n-1);
    }

    /**
     * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
     * 其中n是大于0的整数，求f(10)的值。
     */
    public int f(int n){
        if(n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else{
            //正确的
            return f(n + 2) - 2*f(n + 1);
            //错误的
//            return 2*f(n - 1) + f(n - 2);
        }
    }

    public int method(int n){
        if(n==1){
            return 1;
        }else if(n==2) {
            return 2;
        }else {
            return method(n-1) + method(n-2);
        }
    }


}
