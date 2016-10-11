import CodingInterview.*;
import CodingInterview.Chapter2.LinkedList;

public class Main {
	public static void main(String args[]){	
		Chapter2 myChap = new Chapter2();
		LinkedList myList = new Chapter2().new LinkedList();
		myList.appendNode(1);
		myList.appendNode(2);
		myList.appendNode(3);
		myList.appendNode(1);
		myList.appendNode(2);
		myList.appendNode(3);
		myList.appendNode(4);
		myList.appendNode(5);
		myList.appendNode(6);
		myList.returnTailNode();
		myList.appendNode(7);
		myList.returnTailNode();
		myList.returnTailNode();
		myList.q1DeleteDups();
		myList.appendNode(5);
		myList.appendNode(6);
		myList.returnTailNode();
		myList.appendNode(7);
		myList.returnTailNode();
		myList.returnTailNode();
		myList.appendNode(1);
		myList.appendNode(2);
		myList.appendNode(3);
		myList.appendNode(1);
		myList.appendNode(2);
		myList.appendNode(3);
		myList.appendNode(4);
		myList.appendNode(5);
		myList.appendNode(6);
		myList.q1DeleteDups();
	}
}
