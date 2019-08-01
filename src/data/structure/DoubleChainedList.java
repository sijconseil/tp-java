package data.structure;

public class DoubleChainedList {
	
	private static class Node {
		Node next;
		Node previous;
		Integer value;
		public Node(Integer val) {
			this.value = val;
		}
	}
	
	private Node first;
	private Node last;
	private int size;
	
	public void addFirst(Integer i) {
	}
	
	public void display() {
	}

	
	private Node getNode(int index) {
		// TODO
		return null;
	}
	
	private void checkIndex(int index) {
		if(index<0) throw new ArrayIndexOutOfBoundsException("The index must be strictly positive");
		if(index>=size) throw new ArrayIndexOutOfBoundsException("The index must be less than the size");
	}
	
	public Integer get(int index) {
		// TODO
		return null;
	}
	
	public Integer getFirst() {		
		// TODO
		return null;
		
	}
	public Integer getLast() {		
		// TODO
		return null;
	}
	
	public void clear() {
		// TODO
	}
	
	public Integer removeLast() {		
		// TODO
		return null;
		
	}
	
	public Integer removeFirst() {
		// TODO
		return null;
	}
	
	public void addLast(Integer value) {
		// TODO
	}
	
	public int indexOf(Integer value) {
		// TODO
		return -1;
	}
	
	public boolean contains(Integer value) {
		// TODO
		return false;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {		return size==0;	}
	
	public boolean equals(DoubleChainedList comparedList) {
		// TODO
		return true;
	}
	
	public Integer remove(int index) {
		// TODO
		return null;
	}
	
	public boolean remove(Integer value) {
		// TODO
		return false;
	}
	
}
