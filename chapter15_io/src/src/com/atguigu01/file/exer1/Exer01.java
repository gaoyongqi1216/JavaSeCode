package src.com.atguigu01.file.exer1;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exer01
 * Package: src.com.atguigu01.file.exer1
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 11:36
 * @Version 1.0
 */
public class Exer01 {
    /*
        创建一个与文件abc.txt在相同文件目录下的另一个名为hello.txt文件
     */

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\学习\\01java基础\\IO\\abc.txt");

        System.out.println(file.getAbsoluteFile().getParent());

        File file1 = new File(file.getParent(),"hello.txt");
        System.out.println(file1.getAbsolutePath());
        if(!file1.exists()){
            boolean isSuccessed = file1.createNewFile();
            if (isSuccessed) {
                System.out.println("创建成功");
            }
        }
    }
}
