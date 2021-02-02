package com.FrancisExer_03_TicketSeller;

public class TicketSellerDemo {
    public static void main(String[] args) {

        TicketSeller ts=new TicketSeller();

        Thread t1=new Thread(ts,"窗口1");
        Thread t2=new Thread(ts,"窗口2");
        Thread t3=new Thread(ts,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
