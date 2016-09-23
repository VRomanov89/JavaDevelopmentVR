import JavaBook.Chapter11;
import JavaBook.Chapter11.CallMe;
import JavaBook.Chapter11.Caller;
import JavaBook.Chapter11.Q;

public class Main {
	public static void main(String args[]) throws InterruptedException{	
		Q q = new Chapter11().new Q();
		new Chapter11().new Producer(q);
		new Chapter11().new Consumer(q);
		System.out.println("Press Control-c to stop.");
		
		
	}
}
