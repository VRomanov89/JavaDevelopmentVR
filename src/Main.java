import DataStructures.*;

public class Main {
	public static void main(String args[]){
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "VicePres");
		theTree.addNode(56, "Manager");
		theTree.addNode(24, "Sales");
		theTree.addNode(53, "Eng");
		theTree.addNode(234, "VicePres");
		theTree.addNode(26, "Boss");
		theTree.addNode(13, "VicePres");
		theTree.inOrderTraverseTree(theTree.root);
		
	}
}
