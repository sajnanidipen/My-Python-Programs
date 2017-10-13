import java.rmi.*;
import java.rmi.server.*;
public class Convertor extends UnicastRemoteObject implements CurrencyConvertor{
	public Convertor() throws RemoteException{}
	public float getRate() throws RemoteException{
		System.out.println("1 rupee=0.016 dollar");
		return 0;
	}	
	public float toRupees(float a) throws RemoteException{
		float c=a*64.18f;
		return c;
	}
	public float toDollar(float a) throws RemoteException{
		float d=(a*0.0016f);
		return d;
	}
}