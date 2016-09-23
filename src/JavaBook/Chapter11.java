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
	
	public class CallMe {
		synchronized void call(String msg) {
			System.out.print("[" + msg);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.println("]");
		}
	}
	
	public class Caller implements Runnable {
		String msg;
		CallMe target;
		public Thread t;
		
		public Caller(CallMe targ, String msg) {
			target = targ;
			this.msg = msg;
			t = new Thread(this);
			t.start();
		}
		
		@Override
		public void run() {
			target.call(this.msg);
		}
	}
	
	
	// Producer Consumer, p.252
	
	public class Q {
		int n;
		boolean valueSet = false;
		
		synchronized int get() {
			while(!valueSet) {
				try {
					wait();
				} catch(InterruptedException e) {
					//Interrupted
				}
			}
			System.out.println("Got: " + n);
			valueSet = false;
			notify();
			return n;
		}
		
		synchronized void put(int n) {
			while(valueSet) {
				try {
					wait();
				} catch(InterruptedException e) {
					
				}
			}
			valueSet = true;
			this.n = n;
			System.out.println("Put: " + n);
			notify();
		}
	}
	
	public class Producer implements Runnable {
		Q q;
		
		public Producer(Q q) {
			this.q = q;
			new Thread(this, "Producer").start();
		}
		
		public void run() {
			int i = 0;
			
			while(true) {
				q.put(i++);
			}
		}
	}
	
	public class Consumer implements Runnable {
		Q q;
		
		public Consumer(Q q) {
			while(true) {
				q.get();
			}
		}
		
		public void run() {
			while(true) {
				q.get();
			}
		}
	}
	
	
	
}
