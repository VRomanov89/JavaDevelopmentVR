package DataStructures;

public class Trie<Value> {
	private static final int R = 256;
	private Node root;
	private int n;
	
	private static class Node {
		private Object val;
		private Node[] next = new Node[R];
	}
	public Trie() {
		
	}
	
	private Node get(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) return x;
        char c = key.charAt(d);
        return get(x.next[c], key, d+1);
    }
	
}
