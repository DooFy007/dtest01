package com.cd.collections.arrays;

import java.util.*;
import java.util.ArrayList;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/14
 * @Version
 **/
public class Test {
    public static void main(String[] args) {
       Integer[]  a=new Integer[5];
       Map hashMap=new HashMap<>();
       hashMap.put("aa","bb");
       hashMap.put("aa","cc");
        System.out.println(hashMap);
       hashMap.get("aa");
       a[4]=4;
       a[3]=3;
       for (Integer i : a) {
           System.out.println(i);
       }
    }

}
