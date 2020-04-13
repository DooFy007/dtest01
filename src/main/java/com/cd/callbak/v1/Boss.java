package com.cd.callbak.v1;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class Boss implements CallBack{
    private String name;

    public Boss(String name){
        this.name=name;
    }
    public void releaseAtask(Employee employee) throws InterruptedException {
        System.out.println(name+"发布了任务");
        new Thread(()->{employee.doWork(this);}).start();
        System.out.println("任务发布成功");
    }

    public void callBack(String message) {
        System.out.println(message);
    }


}
