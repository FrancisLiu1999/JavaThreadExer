package com.FrancisExer_02_ThreadRunnableExer;

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableTest r=new RunnableTest();

        Thread t1=new Thread(r,"a");
        Thread t2=new Thread(r,"b");

        t1.start();
        t2.start();
    }
}
