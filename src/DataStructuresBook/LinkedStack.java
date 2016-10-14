package DataStructuresBook;

public class LinkedStack<E> implements Stack<E> {
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	
	public LinkedStack() {
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	public void push(E e) {
		// TODO Auto-generated method stub
		list.addLast(e);
	}

	public E pop() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	public E top() {
		// TODO Auto-generated method stub
		return list.first();
	}

}
