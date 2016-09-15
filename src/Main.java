import DataStructures.*;
import JavaBook.*;

public class Main {
	public static void main(String args[]){
		Chapter8 myChapter = new Chapter8();
		Chapter8.A a = myChapter.new A();
		Chapter8.B b = myChapter.new B();
		Chapter8.C c = myChapter.new C();
		
		Chapter8.A r;
		r = a;
		r.callMe();
		r = b;
		r.callMe();
		r = c;
		r.callMe();
	}
}
