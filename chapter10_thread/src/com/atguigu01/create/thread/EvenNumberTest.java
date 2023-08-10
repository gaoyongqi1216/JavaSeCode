package com.atguigu01.create.thread;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu01.create.thread
 * Description:
 *
 * @Author gyq
 * @Create 2023/6/18 10:22
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber();
        t1.start();

        /*
         * 问题 1 ：是否使用 t1.run()替换 t1.start();的调用，实现分线程的创建和使用
         */
        /*
           问题2：在提供一个分线程，用于100以内的偶数遍历

           注意不能让已经start()的线程，再次执行，否则抛异常，非法的线程异常
         */
        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i + "***");
            }
        }
    }
}

class PrintNumber extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}