package src.com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer03
 * Package: src.com.atguigu01.file.exer3
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 12:02
 * @Version 1.0
 */
public class Exer03 {
    /*
    遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
    public void printFileName(File file)  //file可能是文件，也可能是文件目录
     */
    @Test
    public void test1(){
        File file =  new File("D:\\学习\\01java基础\\IO");
        printFileName(file);
    }

    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f: files) {
                printFileName(f);
            }
        }
    }
    @Test
    public void test2(){
        MoreExer moreExer =new MoreExer();
        File file =  new File("D:\\学习\\01java基础\\IO");
        System.out.println(moreExer.getDirectorySize(file));
    }
}
