package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description: 继承方法买票
 *
 * @Author gyq
 * @Create 2023/7/1 16:18
 * @Version 1.0
 */
class SaleTicket1 extends Thread{
   static int ticket = 100;
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
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s1 = new SaleTicket1();
        SaleTicket1 s2 = new SaleTicket1();
        SaleTicket1 s3 = new SaleTicket1();

        s1.setName("窗口一");
        s2.setName("窗口二");
        s3.setName("窗口三");

        s1.start();
        s2.start();
        s3.start();
    }
}
