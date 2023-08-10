package src.com.atguigu04.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTest
 * Package: src.com.atguigu04.inputstreamreader
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 16:47
 * @Version 1.0
 */
public class InputStreamReaderTest {
    @Test
    public void test1() throws Exception{
        File file =new File("dbcp_utf-8.txt");

        //
        FileInputStream fis = new FileInputStream(file);//此时使用的是IDEA默认的UTF-8的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//显式的使用UTF-8的字符集

        char[] chars = new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }

        isr.close();
    }
    /*
     * 读取到的数据出现了乱码。
     * 因为dbcp_utf-8.txt文件使用的是utf-8的字符集进行的编码，所以在读取此文件时使用的解码集必须也是utf-8，
     * 否则会出现乱码！
     * */
    @Test
    public void test2() throws Exception{
        File file =new File("dbcp_utf-8.txt");

        //
        FileInputStream fis = new FileInputStream(file);//此时使用的是IDEA默认的UTF-8的字符集
        //InputStreamReader isr = new InputStreamReader(fis);
        InputStreamReader isr = new InputStreamReader(fis,"gbk");//显式的使用UTF-8的字符集

        char[] chars = new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }

        isr.close();
    }

    @Test
    public void test3() throws Exception{
        //1. 造文件
        File file1 = new File("dbcp_gbk.txt");
        File file2 = new File("dbcp_gbk_to_utf8.txt");

        //造流
        FileInputStream fis = new FileInputStream(file1);
        //参数2对应的是解码集，必须与dbcp_gbk.txt保持一直
        InputStreamReader isr = new InputStreamReader(fis,"GBK");

        FileOutputStream fos = new FileOutputStream(file2);
        //参数2指明内存中的字符存储到文件中的字节过程中使用的编码集。
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");

        //3. 读写过程
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr.read(cBuffer)) != -1){
            osw.write(cBuffer,0,len);
        }

        System.out.println("操作完成");

        //4. 关闭资源
        osw.close();
        isr.close();
    }
}
