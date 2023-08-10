package com.atguigu03.threadsafe.threadsafe;

import java.awt.*;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *      使用同步方法解决实现Runnable接口的线程安全问题。
 *
 * @Author gyq
 * @Create 2023/7/1 16:18
 * @Version 1.0
 */
class SaleTicket extends Thread{
   static int ticket = 100;
   static Object object = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Window.class) {
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket--);
                }else {
                    break;
                }
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s1 = new SaleTicket();
        SaleTicket s2 = new SaleTicket();
        SaleTicket s3 = new SaleTicket();

        s1.setName("窗口一");
        s2.setName("窗口二");
        s3.setName("窗口三");

        s1.start();
        s2.start();
        s3.start();
    }
}
