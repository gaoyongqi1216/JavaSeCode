package src.com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: src.com.atguigu01.file
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 10:52
 * @Version 1.0
 */
public class FileTest {
    /**
     * * `public File(String pathname) ` ：以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。
     * * `public File(String parent, String child) ` ：以parent为父路径，child为子路径创建File对象。
     * * `public File(File parent, String child)` ：根据一个父File对象和子文件路径创建File对象
     *
     * 绝对路径：**从盘符开始的路径，这是一个完整的路径。
     * 相对路径：**相对于`项目目录`的路径，这是一个便捷的路径，开发中经常使用。
     *   IDEA中，main中的文件的相对路径，是相对于"`当前工程`"
     *   IDEA中，单元测试方法中的文件的相对路径，是相对于"`当前module`"
     *
     */
    @Test
    public void test1(){
       File file =  new File("d://学习//io//hello.txt");

        File file2 =  new File("abc");
        System.out.println(file2.getAbsoluteFile());
    }

    @Test
    public void test2(){
       // public File(String parent, String child)
        //参数一：一定是文件目录
        //参数二：可以是一个文件也可以是一个文件目录
        File file = new File("d://学习//io","abc.txt");
    }

    @Test
    public void test3(){
        //public File(File parent, String child)
    }
}
