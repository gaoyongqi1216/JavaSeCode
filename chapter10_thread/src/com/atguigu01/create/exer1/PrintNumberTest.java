package com.atguigu01.create.exer1;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu01.create.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/6/18 10:57
 * @Version 1.0
 */
public class PrintNumberTest {
    //创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。
    public static void main(String[] args) {
        //方式一
        /*EvenNumberTest t1 = new EvenNumberTest();
        t1.start();
        OddNumberTest t2 = new OddNumberTest();
        t2.start();*/
        //方式2：创建 Thread 类的匿名子类的匿名对象。
        new Thread(){
            public void run() {
                for (int i = 0; i <=100 ; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            public void run() {
                for (int i = 0; i <=100 ; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
class EvenNumberTest extends Thread{//打印偶数
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class OddNumberTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}