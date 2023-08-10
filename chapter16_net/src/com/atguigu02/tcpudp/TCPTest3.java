package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Package: com.atguigu02.tcpudp
 * Description:从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 *
 * @Author gyq
 * @Create 2023/7/20 20:12
 * @Version 1.0
 */
public class TCPTest3 {
    @Test
    public void client() throws Exception {
        //创建一个Socket
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        Socket socket = new Socket(inetAddress,port);

        //创建File的实例，File
        File file = new File("1.jpg");
        FileInputStream fis = new FileInputStream(file);

        //3. 通过Socket，获取输出流
        OutputStream os = socket.getOutputStream();

        //4. 读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        System.out.println("数据发送完毕！");
        //客户端表明不再继续发送数据
        socket.shutdownOutput();
        //5. 接收来着于服务器端的数据
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[5];
        int len1;
        while((len1 = is.read(buffer1)) != -1){
            baos.write(buffer1,0,len1);
        }
        System.out.println(baos.toString());
        //6. 关闭Socket和相关的流
        baos.close();
        is.close();
        os.close();
        fis.close();
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
        File file = new File("1_copy1.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("数据段接受完毕");

        //6.服务端发送数据给客户端
        OutputStream os = socket.getOutputStream();
        os.write("已经接收到了".getBytes());

        os.close();
        fos.close();
        is.close();
        socket.close();
    }
}
