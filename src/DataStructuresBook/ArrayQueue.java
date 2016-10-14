package DataStructuresBook;

public class ArrayQueue<E> implements Queue<E> {
	public static final int CAPACITY = 100;
	private E[] data;
	private int f = 0; // Index of the front element.
	private int size = 0;
	
	public ArrayQueue() {
		this(CAPACITY);
	}

	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public void enqueue(E e) throws IllegalStateException {
		if(size == data.length)  throw new IllegalStateException("Full");
		int available = (f + size) % data.length;
		data[available] = e;
		size++;
	}

	public E dequeue() {
		if(isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		size--;
		return answer;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if (isEmpty()) return null;
		return data[f];
	}
	
}
