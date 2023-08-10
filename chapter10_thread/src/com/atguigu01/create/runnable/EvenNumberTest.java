package com.atguigu01.create.runnable;

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
    public static void main(String[] args) {
//        三、创建当前实现类的对象
        EvenNumberPrint t1 = new EvenNumberPrint();
//        将此对象作为参数传递到Thread类的构造器中，创建Thread类的实列
        new Thread(t1).start();
        EvenNumberPrint t2 = new EvenNumberPrint();
        new Thread(t2,"dd").start();
    }
}
class EvenNumberPrint implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}