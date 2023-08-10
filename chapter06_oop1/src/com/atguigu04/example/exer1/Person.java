package com.atguigu04.example.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/24 20:04
 * @Version 1.0
 */
public class Person {

    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("Studying!");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int age1){
        age += age1;
    }
}
class PersonTest{
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.age = 12;
        p1.name = "Java";
        p1.gender = '男';

        System.out.println(p1.showAge());
    }
}
