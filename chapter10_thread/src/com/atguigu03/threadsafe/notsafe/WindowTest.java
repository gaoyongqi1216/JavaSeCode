package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description: 使用接口的方式卖票
 *
 * @Author gyq
 * @Create 2023/7/1 16:11
 * @Version 1.0
 */
class SaleTicket implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket--);

            }else {
                break;
            }

        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
