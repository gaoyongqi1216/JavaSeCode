package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Package: com.atguigu02.tcpudp
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/20 20:12
 * @Version 1.0
 */
public class TCPTest2 {
    @Test
    public void client() throws Exception {
        //创建一个Socket
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        Socket socket = new Socket(inetAddress,port);

        //创建File的实例，File
        File file = new File("1.jpg");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bos = new BufferedInputStream(fis);

        //3. 通过Socket，获取输出流
        OutputStream os = socket.getOutputStream();

        //4. 读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        System.out.println("数据发送完毕！");
        //关闭输出流
        os.close();
        socket.close();
    }
    @Test
    public void server() throws Exception{
        int port = 9090;
        //创建一个ServerSocket
        ServerSocket sockets = new ServerSocket(port);
        //调用accept(),接受客户端的Socket
        System.out.println("服务器已经开启！");

        Socket socket = sockets.accept();//阻塞式的方法

        System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+"的链接");

        InputStream is = socket.getInputStream();
        File file = new File("1_copy.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("数据段结束完毕");

        fos.close();
        is.close();
        socket.close();
    }
}
