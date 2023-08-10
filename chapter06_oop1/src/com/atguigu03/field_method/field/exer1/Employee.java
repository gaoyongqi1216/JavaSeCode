package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: Employee
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/23 20:11
 * @Version 1.0
 */
public class Employee {
    /**
     * 声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary。
     *
     * 声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
     */
    //属性
    String name;
    int id;
    int age;
    double salary;

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name="Stock";
        employee.age=18;
        employee.id=1;
        employee.salary=1888.10;
        System.out.println("id = " + employee.id + ",name = " + employee.name +
                ", age = " + employee.age + ", salary = " + employee.salary);

        Employee employee1 = new Employee();
        employee1.name="Stock1";
        employee1.age=118;
        employee1.id=11;
        employee1.salary=18881.10;

        System.out.println("id = " + employee1.id + ",name = " + employee1.name +
                ", age = " + employee1.age + ", salary = " + employee1.salary);
    }
}
