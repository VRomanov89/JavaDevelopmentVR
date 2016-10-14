package DataStructuresBook;

public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY = 100;
	private E[] data;
	private int t = -1;
	public ArrayStack() {
		this(CAPACITY);
	}
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t == -1;
	}

	public void push(E e) throws IllegalStateException {
		// TODO Auto-generated method stub
		if(size() == data.length) {
			throw new IllegalStateException("Stack is full");
		} else {
			data[++t] = e;
		}
	}

	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		} else {
			E item = data[t];
			data[t--] = null;
			return item;
		}
	}

	public E top() {
		// TODO Auto-generated method stub
		return data[t];
	}
	
}
