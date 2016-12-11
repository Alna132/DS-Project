package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService {

	private static final long serialVersionUID = 1L;
	
	//- Variables used in this class are declared here.
	private Resultator result;
	private AlgorithmInterface algorithms = null;
	
	public StringServiceImpl() throws RemoteException {
		super();
	}//- End of StringServiceImpl()
	
	@Override
	public Resultator compare(String s, String t, String algo) throws RemoteException {
		result = new ResultatorImpl();
		
		//- Navigation between the different algorithms.
		//- other algorithms can be added with a class file and an else if statement added above the last else statement.
		if (algo == "Levenshtein") {
			algorithms = new Levenshtein();
			result.setResult(algorithms.distance(s, t));
		} else if (algo == "HammingDistance") {
			algorithms = new HammingDistance();
			result.setResult(algorithms.distance(s, t));
		} else if (algo == "DamerauLevenshtein") {
			algorithms = new DamerauLevenshtein();
			result.setResult(algorithms.distance(s, t));
		} else {
			algorithms = new Levenshtein();
			result.setResult(algorithms.distance(s, t));
		}//- End of if/else if
		
		return result;
	}//- End of compare
}//- End of StringServiceImpl
