package com.test.architecture.treads;

public class SomeThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Привет из потока SomeThread");
    }
}
