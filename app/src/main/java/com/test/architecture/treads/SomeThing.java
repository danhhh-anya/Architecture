package com.test.architecture.treads;

public class SomeThing implements Runnable{

    @Override
    public void run() {
System.out.println("Привет из потока SomeThing");
    }
}
