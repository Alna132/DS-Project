package ie.gmit.sw;

import java.rmi.*;

//- A Resultator interface.
public interface Resultator {
	public String getResult() throws RemoteException;
	public void setResult(String result) throws RemoteException; 
	public boolean isProcessed() throws RemoteException; 
	public void setProcessed() throws RemoteException;
}//- End of Resultator
