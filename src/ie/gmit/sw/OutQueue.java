package ie.gmit.sw;

import java.util.concurrent.ConcurrentHashMap;

public class OutQueue {
	//ConcurrentHashMap
	ConcurrentHashMap<String, Resultator> outQueue = new ConcurrentHashMap<String, Resultator>();
}//- End of OutQueue
