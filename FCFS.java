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
		for(int i=0;i<a.size();i++){
			//execution process
			System.out.println((a.get(i)).pid+":"+(a.get(i)).Process_name+" with burst time:"+(a.get(i)).burst_time);
			for(int j=1;j<=(a.get(i)).no_of_inst;j++){
				System.out.println("Process "+(a.get(i)).pid+"executing instruction no:"+j);
				
			}
			
		}
	}
	public static void main(String []args){
		Process p1=new Process(1,"chrome",21,10);
		Process p2=new Process(2,"notepad",22,10);
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