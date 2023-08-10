package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: Student
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/24 20:10
 * @Version 1.0
 */
public class Student {
    //，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
    int number;
    int state;
    int score;

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
class StudentTest{
    public static void main(String[] args) {
        //创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。

        //创建Student[]
        Student[] students = new Student[20];
        //使用循环赋值
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].number=i;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 100);
        }

        //需求1：打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < students.length; i++) {
            if(3 == students[i].state){
                Student stu = students[i];
                System.out.println(stu.toString());
            }
        }

    }
}