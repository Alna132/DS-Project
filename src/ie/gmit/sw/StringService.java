package ie.gmit.sw;

import java.rmi.Remote;
import java.rmi.RemoteException;

//- A StringService interface.
public interface StringService extends Remote {
	//- A Resultator method called compare that takes in 3 variables, 
	//- 2 Strings that will be compared against each other later, 
	//- and a third string that will be used to select which algorithm to use in the comparison of s & t.
	public Resultator compare(String s, String t, String algo) throws RemoteException;
}//- End of StringService
