package test;

import java.util.*;

import java.util.*;
class OddNumbers extends Thread
{
    public void run()
    {
        for(int i=1;i<=15;i+=2)
        {
            System.out.print("First Thread: ");
            System.out.println(i);
        }
    }
}
class EvenNumbers implements Runnable{
    public void run(){
        int i=0;
        for(int j=2;j<=15;j+=2){
            System.out.print("Second Thread: ");
            System.out.println(j);
            i++;
        }
    }
}
class TwelveB{
    public static void main(String h[]){
        OddNumbers obj1 = new OddNumbers();
        obj1.start();
        EvenNumbers obj2 = new EvenNumbers();
        Thread t= new Thread(obj2);
        t.start();
    }
}
