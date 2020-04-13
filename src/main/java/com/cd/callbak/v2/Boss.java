package com.cd.callbak.v2;


/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class Boss {
    private String name;

    public Boss(String name){
        this.name=name;
    }
    public void releaseAtask(Employee employee) throws InterruptedException {
        System.out.println(name+"发布了任务");
        new Thread(()->{employee.doWork(message->{
            System.out.println(message);
        });}).start();
        System.out.println("任务发布成功");
    }

    public void callBack(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) throws InterruptedException {
        Boss boss=new Boss("老板");
        boss.releaseAtask(new Employee("员工"));
    }


}
