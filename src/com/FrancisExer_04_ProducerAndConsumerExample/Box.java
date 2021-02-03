package com.FrancisExer_04_ProducerAndConsumerExample;


public class Box {
    private int milk;
    private boolean status = false;

    public synchronized void put(int milk) {
        if (status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //生产牛奶
        this.milk = milk;
        System.out.println("第" + this.milk + "瓶奶放入奶箱");
        status = true;

        //唤醒其他线程
        notifyAll();
    }

    public synchronized void get() {
        if (!status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        status = false;

        notifyAll();
    }
}
