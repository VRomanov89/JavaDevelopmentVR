package DataStructures;

public class MultiStack {
	private int numberOfStacks;
	private int stackSize;
	private int[] stack;
	private int[] bottom;
	private int[] top;
	public MultiStack(int numberOfStacks, int stackSize) {
		this.numberOfStacks = numberOfStacks;
		this.stackSize = stackSize;
		stack = new int[stackSize * numberOfStacks];
		bottom = new int[numberOfStacks];
		top = new int[numberOfStacks];
		for(int i = 0; i < numberOfStacks; i++) {
			bottom[i] = i * stackSize;
			top[i] = i * stackSize;
		}
	}
	
	public void push(int stackNum, int value) {
		if(top[stackNum]>=bottom[stackNum+1] || top[stackNum]>=stack.length) {
			System.out.println("This stack is full! Can't do anything");
		} else {
			stack[top[stackNum]] = value;
			top[stackNum]++;
		}
	}
	
	public Integer pop(int stackNum) {
		if(top[stackNum] == bottom[stackNum]) {
			System.out.println("Empty stack, nothing to return!");
			return null;
		} else {
			top[stackNum]--;
			System.out.println(stack[top[stackNum]]);
			return stack[top[stackNum]];
		}
	}
	
	
	public void printTop() {
		for(int i = 0; i < numberOfStacks; i++) {
			System.out.print(top[i]);
		}
	}
	
}
