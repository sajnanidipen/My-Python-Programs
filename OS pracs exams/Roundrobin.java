import java.util.*;
import java.io.*;
//use "java myProcess" to execute
class ProcessManager{
	static int gpid=0;
	ArrayList<myProcess> pqueue=new ArrayList<myProcess>();
	void addproc(myProcess a){
		pqueue.add(a);
	}
	void display(){
		for(int i=0;i<pqueue.size();i++){
			System.out.println((pqueue.get(i)).nm);
		}
	}
	//Round Robin
	final int quantum=2; //time given to each process for execution after which it have to be preempted 
	boolean i=false;
	public void exec(){
			int i=0;
			while(pqueue.size()!=0){
				while(i<pqueue.size()){
					(pqueue.get(i)).burst_time=(pqueue.get(i)).burst_time-quantum;
					System.out.println((pqueue.get(i)).nm+" Remaining burst time:"+(pqueue.get(i)).burst_time);
					if((pqueue.get(i)).burst_time<=0){
						System.out.println((pqueue.get(i)).nm+":completely executed");
						pqueue.remove(i);
						i=i-1;
					}
					i=i+1;
				}
				i=0;
			}
			
	}
}
class myProcess{
	int burst_time;
	String nm;
	myProcess(int x,String z)
	{
	burst_time=x;
	nm=z;
	}
	public static void main(String args[]){
		ProcessManager a=new ProcessManager();
		myProcess p1=new myProcess(6,"P1");
		myProcess p2=new myProcess(5,"P2");
		myProcess p3=new myProcess(2,"P3");
		//myProcess p4=new myProcess(3,"P4");
		//myProcess p5=new myProcess(7,"P5");
		System.out.println("-----------------------------------");
		System.out.println("|      Round Robin Algorithm      |");
		System.out.println("-----------------------------------");
		a.addproc(p1);
		a.addproc(p2);
		a.addproc(p3);
		//a.addproc(p4);
		//a.addproc(p5);
		System.out.println("---------------------------------");
		System.out.println("|      Executing Processes      |");
		System.out.println("---------------------------------");
		a.exec();
	}
}
