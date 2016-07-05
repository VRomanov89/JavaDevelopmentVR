package Utilities;
import InterfacesVR.IntStack;

public class FixedStack implements IntStack {
	private int stack[];
	private int position;
	
	public FixedStack(int size){
		stack = new int[size];
		position = 0;
	}

	//Pushing an item onto the stack!
	public void push(int item) {
		// TODO Auto-generated method stub
		if(position >= stack.length-1){
			System.out.println("Stack is full!");
		}else{
			stack[position] = item;
			position++;
		}
	}
	
	//Popping the top item from the stack.
	public int pop() {
		// TODO Auto-generated method stub
		if(position < 0){
			System.out.println("Stack is empty!");
			return 0;
		}else{
			return stack[position--];
		}
	}

}
