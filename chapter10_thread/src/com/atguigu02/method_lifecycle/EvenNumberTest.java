package com.atguigu02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu01.create.runnable
 * Description:
 *
 * @Author gyq
 * @Create 2023/6/18 11:29
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) throws InterruptedException {
        EvenNumberPrint evenNumberPrint = new EvenNumberPrint("线程1");

        evenNumberPrint.start();
        //new Thread(evenNumberPrint).start();
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(10);
        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+ Thread.currentThread().getPriority()+":"+i);
            }
            if(i==20){
                evenNumberPrint.join();
            }
        }
        System.out.println("子线程是否存活："+evenNumberPrint.isAlive());
    }

}
class EvenNumberPrint extends Thread{

    public EvenNumberPrint() {
    }

    public EvenNumberPrint(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            /* try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() +":"+ Thread.currentThread().getPriority()+":"+i);
            }
            if(i%20==0){
                //主动释放CPU的执行权
                Thread.yield();
            }
        }
    }
}