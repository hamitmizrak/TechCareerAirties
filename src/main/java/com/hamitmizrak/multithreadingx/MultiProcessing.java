package com.hamitmizrak.multithreadingx;

public class MultiProcessing extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        Thread.sleep(2000);
                        System.out.print(i+" ");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread.wait();
        thread.notify();
    }
}

/*
class MultiProcessing2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 1; i <= 10; i++) {
                System.out.print(i+" ");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
//PSVM
public static void main(String[] args) {
    MultiProcessing2 processing2=new MultiProcessing2();

}

}*/

/*
class MultiProcessing3  {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}*/
