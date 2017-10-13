import java.util.*;
import java.io.*;
import java.util.ArrayList;

class Process{
    int pid;
    String pname;
    int burst_time;
    int no_of_inst;
    Process(int pid, String pname, int burst_time, int no_of_inst){
        this.pid=pid;
        this.pname=pname;
        this.burst_time=burst_time;
        this.no_of_inst=no_of_inst;
    }
}

class ProcessManager{
    ArrayList<Process> a;
    ProcessManager(){
        a=new ArrayList<Process>();
    }
    void addProcess(Process p){
        a.add(p);
    }
    void exeProcess(){
        for(int i=0;i<a.size();i++){
            System.out.println((a.get(i)).pid+": "+(a.get(i)).pname+": with burst time:"+(a.get(i)).burst_time);
            
            for(int j=1;j<=(a.get(i)).no_of_inst;j++){
            System.out.println("Process ID:"+((a.get(i)).pid+"executing instruction no:"+j));
        }


        }

        
    }

    public static void main(String args[]){
        Process p1 = new Process(1,"chrome",4,7);
        Process p2 = new Process(2,"FB",9,10);
        Process p3 = new Process(3,"Whatsapp",2,2);

        ProcessManager pm = new ProcessManager();
        pm.addProcess(p1);
        pm.addProcess(p2);
        pm.addProcess(p3);

        pm.exeProcess();

    }
}

