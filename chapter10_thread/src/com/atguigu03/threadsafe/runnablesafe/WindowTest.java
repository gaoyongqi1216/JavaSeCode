package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 * 使用实现Runnable接口的方式，实现卖票。--->存在线程安全问题的。
 * 使用同步代码块解决上述卖票中的线程安全问题。
 *
 * @Author gyq
 * @Create 2023/7/1 16:11
 * @Version 1.0
 */
class SaleTicket implements Runnable{
    int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        //synchronized (obj){//对象必须唯一，就造了一个SaleTicket对象 所以还是唯一的
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
                    } else {
                        break;
                    }
                }
            }
        //}
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
