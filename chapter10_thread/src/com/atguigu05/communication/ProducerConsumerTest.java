package com.atguigu05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Package: com.atguigu05.communication
 * Description:
 * 案例2：生产者&消费者
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 *
 * @Author gyq
 * @Create 2023/7/2 11:18
 * @Version 1.0
 */
class Clerk {//店员
    private int productNum = 0;//产品的数量

    //增加产品数量的方法
    public synchronized void add() {
        if (productNum >= 20) {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
            notifyAll();
        }

    }

    //减少产品数量的方法
    public synchronized void min() {
        if (productNum <= 0) {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            productNum--;
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
            notifyAll();
        }

    }
}

class Producer extends Thread {//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.add();//生产产品
        }
    }
}

class Consumer extends Thread {//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品。。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.min();//消费产品
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer pro1 = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);

        pro1.setName("生产着1");
        consumer.setName("消费者1");

        pro1.start();
        consumer.start();

    }
}
