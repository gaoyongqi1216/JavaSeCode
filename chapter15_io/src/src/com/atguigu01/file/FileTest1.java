package src.com.atguigu01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * ClassName: FileTest1
 * Package: src.com.atguigu01
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 11:03
 * @Version 1.0
 */
public class FileTest1 {
    /*
     * public String getName() ：获取名称
     * public String getPath() ：获取路径
     * `public String getAbsolutePath()`：获取绝对路径
     * public File getAbsoluteFile()：获取绝对路径表示的文件
     * `public String getParent()`：获取上层文件目录路径。若无，返回null
     * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
     * public long lastModified() ：获取最后一次的修改时间，毫秒值
     */

    @Test
    public void test1(){
        File file =  new File("d://学习//io//hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }

    @Test
    public void test2(){
        File file =  new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }

    /*
     * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
     * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
     */
    @Test
    public void test3(){
        File file =  new File("D:\\学习\\01java基础\\07_授课代码\\JavaSECode\\chapter15_io");
        System.out.println(Arrays.stream(file.list()).toList());

        File[] files = file.listFiles();
        for (File f:files ) {
            System.out.println(f);
        }
    }

    /*
    File类的重命名功能
    - public boolean renameTo(File dest):把文件重命名为指定的文件路径。

    举例：
    file1.renameTo(file2):要想此方法执行完，返回true。要求：
       file1必须存在，且file2必须不存在，且file2所在的文件目录需要存在。
    * */
    @Test
    public void test4() {
        File file1 = new File("hello.txt");

        File file2 = new File("d:\\io\\abc.txt");

        boolean renameSuccess = file1.renameTo(file2);
        System.out.println(renameSuccess ? "重命名成功" : "重命名失败");
    }

    /*
    判断功能的方法
    - `public boolean exists()` ：此File表示的文件或目录是否实际存在。
    - `public boolean isDirectory()` ：此File表示的是否为目录。
    - `public boolean isFile()` ：此File表示的是否为文件。
    - public boolean canRead() ：判断是否可读
    - public boolean canWrite() ：判断是否可写
    - public boolean isHidden() ：判断是否隐藏
    * */
    @Test
    public void test5() {
        File file1 = new File("D:\\学习\\01java基础\\IO\\abc.txt");
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println();
        File file2 = new File("D:\\学习\\01java基础\\IO\\");
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }

    /*
    创建、删除功能
    - `public boolean createNewFile()` ：创建文件。若文件存在，则不创建，返回false。
    - `public boolean mkdir()` ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
    - `public boolean mkdirs()` ：创建文件目录。如果上层文件目录不存在，一并创建。
    - `public boolean delete()` ：删除文件或者文件夹
      删除注意事项：① Java中的删除不走回收站。② 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录。
    * */

    @Test
    public void test6() throws IOException {
        File file1 = new File("D:\\学习\\01java基础\\IO\\hello.txt");
        //测试文件的创建、删除
        if (!file1.exists()) {
            boolean isSuccessed = file1.createNewFile();
            if (isSuccessed) {
                System.out.println("创建成功");
            }
        } else {
            System.out.println("此文件已存在");


            System.out.println(file1.delete() ? "文件删除成功" : "文件删除失败");
        }
    }

    @Test
    public void test7(){
        //前提：d:\\io文件目录存在，io2或io3目录是不存在的。
        File file1 = new File("D:\\学习\\01java基础\\IO\\io2");

        System.out.println(file1.mkdir());//true

        File file2 = new File("D:\\学习\\01java基础\\IO\\io3");

        System.out.println(file2.mkdirs()); //true
    }

    @Test
    public void test8(){
        //前提：d:\\io文件目录存在，io2或io3目录是不存在的。
        File file1 = new File("d:\\io\\io2\\io4");

        System.out.println(file1.mkdir());//false

        File file2 = new File("d:\\io\\io3\\io5");

        System.out.println(file2.mkdirs()); //true
    }

    @Test
    public void test9(){
        File file1 = new File("d:\\io\\io3\\io5");

        System.out.println(file1.delete());
    }


}
