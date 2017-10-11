Synchronization

Synchronization in java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.

The synchronization is mainly used to
To prevent thread interference.(not to allow another thread during one thread execution)
To prevent consistency problem.(specifically deadlock issue of accesssing the same shared resource)


Evaluate and understand the output of the below program how exactly the two thread are running

import java.io.*;
import java.util.*;
class Table{  
  
void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
class TestSynchronization1{  
public static void main(String args[]){  
Table obj = new Table();//only one object  of class Table that will help to print the table
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  



Now if you want to get the output of one thread first and another thread next so in this the concept of synchronization comes into picture
import java.io.*;
import java.util.*;
class Table{  
  
synchronized void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
class TestSynchronization1{  
public static void main(String args[]){  
Table obj = new Table();//only one object  of class Table that will help to print the table
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  
