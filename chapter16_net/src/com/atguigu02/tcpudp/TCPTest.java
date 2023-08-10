package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest
 * Package: com.atguigu02.tcpudp
 * Description:客户端发送内容给服务端，服务端将内容打印到控制台上。
 *
 * @Author gyq
 * @Create 2023/7/20 19:50
 * @Version 1.0
 */
public class TCPTest {
    @Test
    public void client() throws Exception {
        //创建一个Socket
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 8989;
        Socket socket = new Socket(inetAddress,port);

        //发送数据
        OutputStream os = socket.getOutputStream();
        os.write("您好，我是客户端。".getBytes());

        //关闭socket
        socket.close();
        os.close();
    }

    @Test
    public void server() throws Exception{
        int port = 8989;
        //创建一个ServerSocket
        ServerSocket sockets = new ServerSocket(port);
        //调用accept(),接受客户端的Socket
        System.out.println("服务器已经开启！");

        Socket socket = sockets.accept();//阻塞式的方法

        System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+"的链接");

        //接受数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[5];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//内部维护一个byte[]数组
        while ((len = is.read(buffer))!=-1){
            //可能会出现乱码
           /* String str = new String(buffer,0,len);
            System.out.print(str);*/
            baos.write(buffer,0,len);
        }
        System.out.println(baos.toString());
        System.out.println("\n数据接收完毕");
        //关闭Socket,ServerSocket
        socket.close();
        is.close();
    }
}
