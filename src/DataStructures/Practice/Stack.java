package DataStructures.Practice;

public class Stack {
	//FIFO structure
	private class Layer {
		int data;
		String data2;
		Layer next;
		Layer(int data, String data2) {
			this.data = data;
			this.data2 = data2;
		}
	}
	Layer top;
	
	public void push(int data, String data2) {
		Layer myLayer = new Layer(data, data2);
		myLayer.next = top;
		System.out.println("Pushed a new layer!");
	}
	
	public Layer pop() {
		if (top != null) {
			top = top.next;
		} else {
			System.out.println("Stack is empty");
		}
		return top;
	}
	
	public Layer peek() {
		return top;
	}
	
}
