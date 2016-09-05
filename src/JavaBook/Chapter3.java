package JavaBook;

public class Chapter3 {
	public void charDemo() {
		char ch1, ch2;
		ch1 = 88;
		ch2 = 'Y';
		System.out.print("ch1 and ch2: ");
		System.out.println(ch1 + " " + ch2);
	}
	
	public void charDemo2() {
		char ch1;
		ch1 = 'X';
		System.out.println("ch1 is currently = " + ch1);
		ch1++;
		System.out.println("ch1 is now = " + ch1);
	}
	
	public void boolDemo() {
		boolean b;
		b = false;
		System.out.println("b is currently " + b);
		b = true;
		System.out.println("b is currently " + b);
		if(b) System.out.println("b is true!");
		b = false;
		if(b) System.out.println("b is false?!");
		System.out.println("10 > 9 is " + (10 > 9));
	}
	
	public void conversionDemo() {
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.println("\nConversion of an int to a byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		
		System.out.println("\nConversion of double to int");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		
		System.out.println("\nConversion of double to byte");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);
	}
}
