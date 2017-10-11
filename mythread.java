class MyThread implements Runnable{
	int a;
	MyThread(int a){
		this.a=a;
	}
	public void run(){
			for(int i=0;i<5;i++){
				try{
				
					System.out.println("THread"+a+":"+"counting:"+i);
					Thread.sleep(500);
				}
				catch(InterruptedException e){
					System.out.println(e);
				}
			}
		
	}
	public static void main(String []args){
		MyThread m1=new MyThread(1);
		MyThread m2=new MyThread(2);
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();
	}
}