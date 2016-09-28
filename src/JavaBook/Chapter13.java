package JavaBook;
import java.io.*;

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
}
