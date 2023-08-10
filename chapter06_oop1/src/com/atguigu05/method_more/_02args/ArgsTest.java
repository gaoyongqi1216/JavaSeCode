package com.atguigu05.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();
        argsTest.print();
        argsTest.print(new int[]{1,2});
        argsTest.print(1);
        argsTest.print(1,2);
    }

    public void print(int ... nums){
        System.out.println("1111");
    }

    public void print(int i){
        System.out.println("222");
    }

    public void print(int i,int j){
        System.out.println("333");
    }

    /**
     * 场景举例
     * String sql = "update customer set name=? where id=?"
     *
     * public void update(String sql,String ... objs);
     */
}
