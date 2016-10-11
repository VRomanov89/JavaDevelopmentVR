package CodingInterview;

import java.util.*;

public class Chapter2 {
	class Node {
		Node next = null;
		int data;
		public Node(int d) {
			this.data = d;
		}
	}
	public class LinkedList {
		Node tail = null;
		
		public void appendNode(int data) {
			Node createNode = new Node(data);
			if(tail != null) {
				createNode.next = tail;
			}
			tail = createNode;
			System.out.println("Appended " + data);
		}
		
		public int returnTailNode() {
			if (tail.next != null) {
				Node lastNode = tail;
				tail = tail.next;
				System.out.println("Removed " + lastNode.data);
				return lastNode.data;
			} else {
				System.out.println("Nothing to remove");
				return 666;
			}
		}
		
		public void q1DeleteDups() {
			HashSet<Integer> set = new HashSet<Integer>();
			Node current = tail;
			Node previous = current;
			while(current.next != null) {
				if(set.contains(current.data)) {
					previous.next = current.next;
					System.out.println("Removed duplicate data: " + current.data);
				}else{
					set.add(current.data);
				}
				previous = current;
				current = current.next;
			}
		}
	}
}
