package com.atguigu04.threadsafemore.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/1 17:38
 * @Version 1.0
 */
public class BankTest {
    static Bank bank1 = null;
    static Bank bank2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                bank1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                bank2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank2 == bank1);
    }
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    //方式1：
    public static synchronized Bank getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Bank();
        }
        return instance;
    }

    //方式二
    public static Bank getInstance1() {
        synchronized (Bank.class) {
            if (instance == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                instance = new Bank();
            }
        }
        return instance;
    }

    //方式三:相当于方式一和方式二效率更高
    public static Bank getInstance2() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
