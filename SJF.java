import java.util.ArrayList;
class ProcessManager{
	ArrayList<Process> a;
	ProcessManager(){
		a=new ArrayList<Process>();
	}
	void addProcess(Process p){
		a.add(p);
	}
	void exeProcess(){
		/*for(Process itr:a){
			System.out.println(itr.pid+":"+itr.Process_name);
		}*///Using advance for loop
		while(a.isEmpty()!=true){
			int x=1; //initilize to 1 because comparison has to be done after 0th element 
			smallest=(a.get(0)).burst_time;
			int index=0;
			while(x<a.size()){ 
				if (smallest>(a.get(x)).burst_time){
					smallest=(a.get(x)).burst_time;
					index=x;
				}
				x=x+1;
			}
			System.out.println((a.get(index)).Process_name);
			a.remove(index);
		}
		
	}
	public static void main(String []args){
		Process p1=new Process(1,"chrome",21,10);
		Process p2=new Process(2,"notepad",21,10);
		Process p3=new Process(3,"music player",4,3);
		ProcessManager pm=new ProcessManager();
		pm.addProcess(p1);
		pm.addProcess(p2);
		pm.addProcess(p3);
		pm.exeProcess();
	}
}
class Process{
	int pid;
	String Process_name;
	int burst_time;
	int no_of_inst;
	Process(int pid,String Process_name,int burst_time,int no_of_inst){
		this.pid=pid;
		this.Process_name=Process_name;
		this.burst_time=burst_time;
		this.no_of_inst=no_of_inst;
	}
}