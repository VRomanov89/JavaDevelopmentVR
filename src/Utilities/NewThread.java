package Utilities;

public class NewThread implements Runnable {
	public Thread t;
	
	public NewThread() {
		t = new Thread(this, "Demo Thread");
		t.start();
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread");
	}
}
