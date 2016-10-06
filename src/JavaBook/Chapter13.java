package JavaBook;
import java.applet.Applet;
import java.awt.Graphics;
import java.io.*;
import Utilities.*;

public class Chapter13 {
	public void readData() throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		do {
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');
	}
	
	public void FileOpen(String fileName) {
		int i;
		FileInputStream fin;
		if(fileName.length() <= 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		try {
			fin = new FileInputStream(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("Cannot open file");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while(1 != -1);
		}catch(IOException e) {
			System.out.println("Error reading file.");
		}
		
		try {
			fin.close();
		}catch(IOException e) {
			System.out.println("Error closing");
		}
	}
	
	public class Stats<T extends Number> {
		T[] nums;
		Stats(T[] o) {
			nums = o;
		}
		
		double average() {
			double sum = 0.0;
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i].doubleValue();
			}
			return sum/nums.length;
		}
	}
	
}
