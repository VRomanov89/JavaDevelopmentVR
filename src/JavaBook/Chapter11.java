package JavaBook;

public class Chapter11 {
	public void threadTest() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		t.setName("Vlad's thread");
		System.out.println("Current thread: " + t);
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			} 
		} catch(InterruptedException e) {
			System.out.println("Main thread stipped");
		}
	}
}
