package DataStructures.Practice;

public class CircularQueue {
	class Node {
		Node next;
		int storedData;
		Node(int data) {
			storedData = data;
		}
		void setNext(Node nextNode) {
			next = nextNode;
		}
		Node getNext() {
			return next;
		}
		int getData() {
			return storedData;
		}
	}
	Node head;
	Node tail;
	int count;
	public CircularQueue() {
		count = 0;
	}
	public void add(int data) {
		Node newNode = new Node(data);
		if(count == 0) {
			head = newNode;
			tail = newNode;
			newNode.setNext(newNode);
			count++;
		}else {
			newNode.setNext(tail);
			tail = newNode;
			head.setNext(tail);
			count++;
		}
		System.out.println("Added value = " + data + " count at = " + count);
	}
	
	public Node remove() {
		Node ref1 = tail;
		Node ref2 = head;
		if(count > 0){
			while(ref1.getNext() != head) {
				ref1 = ref1.getNext();
			}
			ref1.setNext(tail);
			head = ref1;
			count--;
			System.out.println("Removed value = " + ref2.getData() + " count at = " + count);
			return ref2;
		} else {
			System.out.println("We're empty!");
			Node errorNode = new Node(666);
			return errorNode;
		}
	}
}
