import java.rmi.RMISecurityManager;
import java.rmi.Naming;
public class RMI_Client{
	public static void main(String []args) throws Exception{
		RMISecurityManager rsm=(RMISecurityManager)System.getSecurityManager();
		CurrencyConvertor cci=(CurrencyConvertor)Naming.lookup("localhost");
		System.out.println(cci.getRate());
		System.out.println(cci.toRupees(3));
		System.out.println(cci.toDollar(3));
	}
}