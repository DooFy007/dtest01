package com.cd.string;
import java.lang.String;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/14
 * @Version
 **/
public class Test {
    public static void main(String[] args) {
        char[] chars={'我','a',97};
        String s=new String(chars);
        byte[] bytes = s.getBytes();
        for (byte b:bytes){
            System.out.println(b);
        }

        for (char c1:chars) {
            System.out.println(c1);
        }

        byte b=1;
//        System.out.println(Integer.toBinaryString(b)&0xff);
//        1111 1111 1 2 4 8 16 32 64 128
//            111 1111 =127
//            1111 1111=255=0xff

        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(1<<2));
        System.out.println(b<<2);
        System.out.println(1>>>3);
        System.out.println(s.hashCode());
        Object o1=new Object();
        Object o2=new Object();
        System.out.println(o1.hashCode()==o2.hashCode());
        System.out.println(o1.equals(o2));
        String s1="abc";
        String s2="abc";
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.equals(s2));
//        Integer
    }
}
