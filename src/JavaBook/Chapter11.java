package JavaBook;

import JavaBook.Chapter11.NewThread;

public class Chapter11 {
	public void threadTest() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		t.setName("Vlad's thread");
		System.out.println("Current thread: " + t);
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(500);
			} 
		} catch(InterruptedException e) {
			System.out.println("Main thread stipped");
		}
	}
	
	public class NewThread implements Runnable {
		Thread t;
		public NewThread() {
			this.t = new Thread(this, "Second thread");
			System.out.println("Second thread: ");
			this.t.start();
		}

		public void run() {
			System.out.println("Secad: ");
				for(int i = 5; i >=0; i--) {
					System.out.println("Second thread: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
	}

}
