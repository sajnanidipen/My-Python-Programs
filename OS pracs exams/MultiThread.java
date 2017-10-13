import java.util.*;
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
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
class hello implements Runnable{
	Thread t;
	hello(){
		t=new Thread(this);
		t.start();
	}
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("Hello");
				Thread.sleep(1000);
			}
		}  
		catch(InterruptedException e){
			System.out.println(e);
		}
	}	
}
class thread{
	public static void main(String []args){
		Hi h=new Hi();
		hello h1=new hello();
		/*h1.start();
		h.start();*/
	}
}