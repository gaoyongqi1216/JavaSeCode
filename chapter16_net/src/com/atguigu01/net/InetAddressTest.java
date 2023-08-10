package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Package: com.atguigu01.net
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/19 20:41
 * @Version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) {
        //1.实例化

        try {
            //InetAddress.getByName();
            InetAddress inetAddress = InetAddress.getByName("192.168.101.4");
            System.out.println(inetAddress);

            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            //getLocalHost() 获取本地ip对应InetAddress的实例
            InetAddress inetAddress3 =InetAddress.getLocalHost();
            System.out.println(inetAddress3);

            InetAddress inetAddress4 = InetAddress.getByName("127.0.0.1");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
