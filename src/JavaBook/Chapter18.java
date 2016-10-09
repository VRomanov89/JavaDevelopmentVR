package JavaBook;
import java.util.*;

public class Chapter18 {
	public void arrayListDemo() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Initial size = "+ al.size());
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(1);
		al.add(2);
		System.out.println("Next size = "+ al.size());
		System.out.println("Contents = "+ al);
		Integer bob[] = new Integer[al.size()];
		bob = al.toArray(bob);
		int sum = 0;
		for(int i : bob) {
			sum+= i;
		}
		System.out.println("Sum = "+sum);
	}
	
	public void hashDemo() {
		HashMap<String, Double> myHash = new HashMap<String, Double>();
		
		myHash.put("String1", 1.0);
		myHash.put("String2", 2.0);
		myHash.put("String3", 3.0);
		myHash.put("String4", 4.0);
		myHash.put("String5", 5.0);
		Set<Map.Entry<String, Double>> set = myHash.entrySet();
		
		for(Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ":" + me.getValue());
		}
	}
	
	
}
