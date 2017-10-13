import java.rmi.*;
public interface CurrencyConvertor extends Remote{
	public float getRate() throws RemoteException;
	public float toRupees(float a) throws RemoteException;
	public float toDollar(float a) throws RemoteException;
	
}