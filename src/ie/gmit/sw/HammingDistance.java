package ie.gmit.sw;

public class HammingDistance implements AlgorithmInterface {
	public String distance(String s, String t) {
		if (s.length() != t.length()) return Integer.toString(-1); //Similar length strings only
		int counter = 0;
		
		for (int i = 0; i < s.length(); ++i){
			if (s.charAt(i) != t.charAt(i)) counter++;
		}
		return  Integer.toString(counter);
	}
/*	
    public static void main(String[] args) {
    	HammingDistance algo = new HammingDistance();
    	System.out.println(algo.distance("Distributed Systems", "Disturbed Systems"));
    	System.out.println(algo.distance("Distributed Systems", "Distressed Sausages"));
    	System.out.println(algo.distance("Distributed Systems", "Distasteful Sisters"));
    	System.out.println(algo.distance("Distributed Systems", "Distended Cisterns"));
    	System.out.println(algo.distance("Distributed Systems", "Distempered Sisyphus"));
    	System.out.println(algo.distance("Distributed Systems", "Distilled Cistercians"));
	}
*/	
}
