package com.atguigu03.threadsafe.exer;

/**
 * ClassName: AccountTest
 * Package: com.atguigu03.threadsafe.exer
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/1 17:22
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account =new Account();

       Customer customer1 = new Customer(account,"甲");
       Customer customer2 = new Customer(account,"亿");

       customer1.start();
       customer2.start();
    }
}
class Account{
    private double balance;//余额

    public synchronized void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }
        System.out.println(Thread.currentThread().getName()+"存钱1000快，余额为："+balance);
    }
}
class Customer extends Thread{
    Account account;

    public Customer(Account account){
        this.account =account;
    }
    public Customer(Account account,String name){
        super(name);
        this.account =account;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //long random = (long) Math.random() * (1000-100+1) + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.deposit(1000);
        }
    }
}
