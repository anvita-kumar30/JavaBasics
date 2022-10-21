package test;

import java.util.*;

class TwelveA extends Thread{
    public static void main(String args[]){
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        System.out.println("Initial name of thread: "+t1.getName());
        System.out.println("Initial name of thread: "+t2.getName());
        t1.setName("First");
        t2.setName("Second");
        System.out.println("After changing name of thread: "+t1.getName());
        System.out.println("After chaning name of thread: "+t2.getName());
    }
}