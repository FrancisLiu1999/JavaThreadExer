package com.FrancisExer_01_ThreadExer;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest tt1 = new ThreadTest("mj");
        ThreadTest tt2 = new ThreadTest();

        //设置守护线程
        tt1.setDaemon(true);
        tt2.setDaemon(true);

        tt1.start();
        tt1.join();
        tt2.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(tt1.getPriority());//设置优先级1-10
        System.out.println(tt2.getPriority());


        tt1.setPriority(5);
        tt2.setPriority(5);


        Thread.currentThread().setName("主线程");

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
