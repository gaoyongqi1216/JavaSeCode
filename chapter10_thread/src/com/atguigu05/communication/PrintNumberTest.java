package com.atguigu05.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu05.communication
 * Description:
 *  使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author gyq
 * @Create 2023/7/2 10:31
 * @Version 1.0
 */
class  PrintNumber implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if(number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "打印了第：" + number);
                    number++;

                    try {
                        wait();//线程一旦执行此方法就进入了等待状态,同时会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();

        Thread t1 = new Thread(p1,"线程1");
        Thread t2 = new Thread(p1,"线程2");

        t1.start();
        t2.start();

    }
}
