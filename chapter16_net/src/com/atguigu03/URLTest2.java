package com.atguigu03;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ClassName: URLTest2
 * Package: com.atguigu03
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/21 20:19
 * @Version 1.0
 */
public class URLTest2 {

    public static void main(String[] args) throws Exception{
        HttpURLConnection httpURLConnection = null;
        InputStream is = null;
        ByteArrayOutputStream boas = null;
        String str ="http://127.0.0.1:8080/examples/abc.txt";
        try {
            URL url = new URL(str);
            httpURLConnection = (HttpURLConnection) url.openConnection();

            is = httpURLConnection.getInputStream();
            FileOutputStream fos = new FileOutputStream(new File("http://127.0.0.1:8080/examples/abc.txt"));
            boas = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len=is.read(buffer))!=-1){
                boas.write(buffer,0,len);
            }
            System.out.println(boas.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //5. 关闭资源
            try {
                if (boas != null)
                    boas.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (httpURLConnection != null)
                httpURLConnection.disconnect();
        }
    }

}
