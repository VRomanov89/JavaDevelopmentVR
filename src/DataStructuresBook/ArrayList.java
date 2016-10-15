package DataStructuresBook;

public class ArrayList<E> implements List<E> {
	public static final int CAPACITY = 16;
	private E[] data;
	private int size = 0;
	
	public ArrayList() {
		this(CAPACITY);
	}
	public ArrayList(int capacity) {
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
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if(i < 0 || i > n) {
			throw new IndexOutOfBoundsException("Illegal index: " + i);
		}
	}

	public E get(int i) throws IndexOutOfBoundsException {
		return null;
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size + 1);
		if(size == data.length) {
			throw new IllegalStateException("Array is full.");
		}
		for(int k = size - 1; k >= i; k--) {
			data[k+1] = data[k];
		}
		data[i] = e;
		size++;
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
