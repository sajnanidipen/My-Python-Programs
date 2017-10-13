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
        a = new ArrayList<Process>();
    }
    public void addProcess(Process p){
        a.add(p);
    }
    public void exeProcess(){
        // For FCFS from here!!
        /*
        for(int i=0;i<a.size();i++){
            System.out.println("Process ID:"+(a.get(i)).pid+"Process Name:"+(a.get(i)).pname+"with burst time"+(a.get(i)).burst_time);
            for(int j=1;j<=(a.get(i)).no_of_inst;j++){
                System.out.println("Process ID:"+(a.get(i)).pid+" executing instruction no:"+j);
            }
        }
        */
        // Till hree for FCFS

        // For SJF from here!!

        int smallest;
        while(a.isEmpty()!=true){
            int x=1;
            smallest=(a.get(0)).burst_time;
            int index=0;
            while(x<a.size()){
                if(smallest>(a.get(x)).burst_time){
                    smallest=(a.get(x)).burst_time;
                    index=x;
                }
                x=x+1;
            }
            System.out.println("Process Name:"+(a.get(index)).pname);
            a.remove(index);
        }
    }

    public static void main(String args[]){
        Process p1 = new Process(1,"Coincap",4,5);
        Process p2 = new Process(2,"Coinbase",3,9);
        Process p3 = new Process(3,"Poloniex",9,1);

        ProcessManager pm = new ProcessManager();
        pm.addProcess(p1);
        pm.addProcess(p2);
        pm.addProcess(p3);

        pm.exeProcess();
    }
}