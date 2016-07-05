package Utilities;
import InterfacesVR.IntStack;

public class DynamicStack implements IntStack {
	//body
	private int stack[];
	private int position;
	
	DynamicStack(int size){
		stack = new int[size];
		position = -1;
	}
	
	public void push(int item){
		if(position==stack.length-1){
			int temp[] = new int[stack.length * 2];
			for(int i = 0; i<stack.length; i++){
				temp[i] = stack[i];
			}
			stack = temp;
			stack[++position] = item;
		}else{
			stack[++position] = item;
		}
	}
	
	public int pop(){
		if(position < 0){
			System.out.println("Stack is empty");
			return 0;
		}else{
			return stack[position--];
		}
	}
}
