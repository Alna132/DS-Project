package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

//- This class holds the main method and will be in charge of running the RMI server.
public class Servant {

	public static void main(String[] args) throws Exception {
		StringService stringServ = new StringServiceImpl();
		
		LocateRegistry.createRegistry(8080);
		Naming.rebind("comparator", stringServ);
		
		System.out.println("Server is ready and waiting on port 8080!");
	}//- End of main

}//- End of Runner
