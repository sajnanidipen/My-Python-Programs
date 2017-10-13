import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.*;
public class RMI_Server{
	public static void main(String []args) throws Exception{
		RMISecurityManager rsm = (RMISecurityManager)System.getSecurityManager();
		System.setSecurityManager(rsm);
		Convertor c=new Convertor();
		Naming.rebind("localhost",c);
		System.out.println("Server Done");
	}
}