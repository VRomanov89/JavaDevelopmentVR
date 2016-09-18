import DataStructures.*;
import JavaBook.*;
import JavaBook.Chapter11.NewThread;

public class Main {
	public static void main(String args[]) throws InterruptedException{
		Chapter11 mychap = new Chapter11();
		new Chapter11().new NewThread();
		//Chapter11 myChap = new Chapter11();
		mychap.threadTest();	
	}
}
