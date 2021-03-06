package com.cd.callbak.v2;

import java.util.function.Consumer;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class Employee {
    private String name;
    public Employee(String name){
        this.name=name;
    }
    public void doWork(Consumer consumer){
        System.out.println(name+"正在执行任务...");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.accept("任务已完成");
    }
}
