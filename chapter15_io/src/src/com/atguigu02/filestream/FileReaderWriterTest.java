package src.com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileReaderWriterTest
 * Package: src.com.atguigu02.filestream
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 13:22
 * @Version 1.0
 */
public class FileReaderWriterTest {
    /*
        读取hello.txt内容
     */
    @Test
    public void test1() {
        FileReader fr = null;
        try {
            //1.创建File对象，对应hello.txt文件
            File file = new File("hello.txt");

            //2.创建一个输入型的字符流，用于读取数据
            fr = new FileReader(file);

            //3.读取数据，并显示在控制器上
        /*int data = fr.read();
        while (data!=-1){
            System.out.print((char) data);
            data = fr.read();
        }*/

            //方式2
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流资源的关闭操作
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test2() {
        FileReader fr = null;
        try {
            //1.创建File对象，对应hello.txt文件
            File file = new File("hello.txt");

            //2.创建一个输入型的字符流，用于读取数据
            fr = new FileReader(file);

            //3.读取数据，并显示在控制器上
            char[] chars = new char[5];
            int len;
            while ((len = fr.read(chars)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(chars[i]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流资源的关闭操作
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
        将内存的数据写出到指定的文件中
     */
    @Test
    public void test3() {
        FileWriter fw = null;
        try {
            //1. 创建File类的对象，指明要写出的文件名称
            File file = new File("info.txt");
            //2.创建输出流
            //追加文件内容用的构造器
            fw = new FileWriter(file, true);
            //3.
            fw.write("I love you \n");
            fw.write("iii7888 \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关闭
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* 赋值一份hello.txt 命名为hello_copy文件 */
    @Test
    public void test4() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy.txt");

            //2.创建输入流 输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出的过程
            char[] chars = new char[5];
            int len;//记录每次读入到chars的字符个数
            while ((len = fr.read(chars)) != -1) {
               /* for (int i = 0; i < len; i++) {
                    fw.write(chars[i]);
                }*/
                //或者
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { //4.关闭资源
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
