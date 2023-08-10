package src.com.atguigu01.file.exer2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * ClassName: Exer02
 * Package: src.com.atguigu01.file.exer2
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/16 11:41
 * @Version 1.0
 */
public class Exer02 {
    /*
    判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称

    提示：File类提供了文件过滤器方法(拓展)
    public String[] list(FilenameFilter filter)
     */
    public static void main(String[] args) {
        File file = new File("D:\\学习\\01java基础\\IO");
        //方式1
      /*  String[] listFiles = file.list();
        for (String s :listFiles){
            if(s.endsWith(".jpg")){
                System.out.println(s);
            }
        }*/

        //方式2
        //public String[] list(FilenameFilter filter)
        String[] listFiles = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                /*if(name.endsWith(".jpg")){
                    return true;
                }else {
                    return false;
                }*/
                return name.endsWith(".jpg");
            }
        });
        System.out.println(Arrays.stream(listFiles).toList());
    }
}
