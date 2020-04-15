package com.cd.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class Test {
    public static void main(String[] args) {
        Map map=new ConcurrentHashMap ();
        Map map2=new HashMap();
        System.out.println(1<<30);
        System.out.println(Integer.toBinaryString(16));
        System.out.println(2>>>4);
        String s="abc";
        System.out.println(Integer.toBinaryString(s.hashCode()));
        System.out.println();
    }
}
