package src.com.atguigu02.filestream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileStreamTest
 * Package: src.com.atguigu02.filestream
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 16:18
 * @Version 1.0
 */
public class FileStreamTest {
    /*
     * 需求：复制一份playgirl.jpg文件，命名为playgirl_copy.jpg
     *
     * */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("th.jpg");
            File destFile = new File("playgirl_copy.jpg");

            //2. 创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出
            byte[] bytes = new byte[1024];
            int len;//记录每次读入到bytes中字节的个数
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /*
     * 需求：复制一份hello.txt文件，命名为hello_copy1.txt
     *
     *  可以使用字节流实现文本文件的复制。
     * */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy1.txt");

            //2. 创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出
            byte[] buffer = new byte[5];
            int len;//记录每次读入到buffer中字节的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*
     * 需求：读取hello.txt文件，将数据显示在控制台上。
     * 可能出现乱码。
     * */
    @Test
    public void test3() {
        FileInputStream fis = null;
        try {
            File srcFile = new File("hello.txt");

            fis = new FileInputStream(srcFile);

            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                String str = new String(bytes, 0, len);
                System.out.print(str);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
