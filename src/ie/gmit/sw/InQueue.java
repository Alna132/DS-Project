package ie.gmit.sw;

import java.util.LinkedList;

public class InQueue implements Runnable {
	//LinkedList
	private LinkedList<Runnable> inQueueLL;

	public InQueue(LinkedList<Runnable> inQueue) {
		this.inQueueLL = inQueue;
	}//- End of InQueue constructor.
	
	@Override
	public void run() {
		
	}
	
}//- End of InQueue
