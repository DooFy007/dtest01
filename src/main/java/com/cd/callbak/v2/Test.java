package com.cd.callbak.v2;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Boss boss=new Boss("老板");
        boss.releaseAtask(new Employee("员工"));
    }
}
