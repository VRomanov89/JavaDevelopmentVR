package JavaBook;

public class Chapter8 {
	public class A {
		public void callMe() {
			System.out.println("Inside A's call method");
		}
	}
	
	public class B extends A {
		public void callMe() {
			System.out.println("Inside B's call method");
		}
	}
	
	public class C extends A {
		public void callMe() {
			System.out.println("Inside C's call method");
		}
	}
}
