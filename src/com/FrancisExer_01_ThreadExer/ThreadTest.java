package com.FrancisExer_01_ThreadExer;

public class ThreadTest extends Thread {
    public ThreadTest() {
    }

    public ThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
