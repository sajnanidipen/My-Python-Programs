import java.util.*;
import java.io.*;
class Hi implements Runnable{
    Thread t;
    Hi(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Hello implements Runnable{
    Thread t;
    Hello(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Multhread{
    public static void main(String args[]){
        Hi h1=new Hi();
        Hello h2=new Hello();
    }
}