package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConCarTest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author gyq
 * @Create 2023/5/27 11:32
 * @Version 1.0
 */
public class StringConCarTest {
    public static void main(String[] args) {
        StringConCarTest conCarTest = new StringConCarTest();
        System.out.println(conCarTest.concat("a", "b"));
        System.out.println(conCarTest.concat());
    }

    //n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
    public String concat(String ... arg){
        if(arg.length<=0){
            return "  1";
        }
        String value = "";
        for (int i = 0; i < arg.length; i++) {
            value += arg[i];
        }
        return value;
    }
}
