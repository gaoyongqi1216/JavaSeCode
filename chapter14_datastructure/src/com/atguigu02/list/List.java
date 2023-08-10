package com.atguigu02.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * ClassName: List
 * Package: com.atguigu02.list
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/3 19:35
 * @Version 1.0
 */
public class List {
    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();

        list.add("AA"); //elementData[0] = "AA";
        list.add("BB");//elementData[1] = "BB";
    }

    @Test
    public void test2(){
        Vector v = new Vector(); //底层初始化数组，长度为10.Object[] elementData = new Object[10];

        v.add("AA"); //elementData[0] = "AA";
        v.add("BB");//elementData[1] = "BB";
    }

    @Test
    public void test3(){
        LinkedList<String> list = new LinkedList<>(); //底层也没做啥
        list.add("AA"); //将"AA"封装到一个Node对象1中，list对象的属性first、last都指向此Node对象1。
        list.add("BB"); //将"BB"封装到一个Node对象2中，对象1和对象2构成一个双向链表，同时last指向此Node对象2

    }
}
