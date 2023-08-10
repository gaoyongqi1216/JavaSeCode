package com.atguigu03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName: MaoTest
 * Package: com.atguigu03.map
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/15 13:36
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void  test1(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "张三");
        map.put(31, "李四");
    }

    @Test
    public void test2(){
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("AA",123);
    }

}
