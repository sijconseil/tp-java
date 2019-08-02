package data.structure;

public class DoubleChainedList implements IntegerChainedList{
	
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
	
	@Override public void addFirst(Integer value) {
		Node oldFirst = first;
		first = new Node(value);
		first.next = oldFirst;
		if(last==null) last = first;
		size++;
	}

	@Override public void addLast(Integer value) {
		Node oldLast = last;
		last = new Node(value);
		last.previous = oldLast;
		if(first==null) first = last;
		size++;
	}
	
	public void display() {
		System.out.print("[");
		Node currentNode = first;
		String comma = "";
		while(currentNode!=null) {
			System.out.print(comma+currentNode.value);
			comma=",";
			currentNode = currentNode.next;
		}
		System.out.print("]\n");
	}

	private Node getNodeFromFirst(int index) {
		checkIndex(index);
		Node current = first;
		for(int i=0;i<index-1;i++) {
			current = current.next;
		}
		return current;
	}
	
	private Node getNodeFromLast(int index) {
		checkIndex(index);
		Node current = last;
		for(int i=0;i<size-index-1;i++) {
			current = current.previous;
		}
		return current;
	}
	
	private Node getNode(int index) {
		if(index>size/2) return getNodeFromLast(index);
		else return getNodeFromFirst(index);
	}
	
	private void checkIndex(int index) {
		if(index<0) throw new ArrayIndexOutOfBoundsException("The index must be strictly positive");
		if(index>=size) throw new ArrayIndexOutOfBoundsException("The index must be less than the size");
	}
	
	@Override public Integer get(int index) {
		return getNode(index).value;
	}
	
	@Override public Integer getFirst() {		
		if(first==null)return null;
		return first.value;
		
	}
	@Override public Integer getLast() {		
		if(last==null)return null;
		return last.value;
	}
	
	@Override public void clear() {
		first = null;
		last = null;
		size=0;
	}
	
	@Override public Integer removeLast() {		
		if(size==0)return null;
		Node oldLast= last;
		last = oldLast.previous;
		size--;
		if(size==1) first = last;
		return oldLast.value;

		
	}
	
	@Override public Integer removeFirst() {
		if(size==0)return null;
		Node oldFirst = first;
		first = oldFirst.next;
		size--;
		if(size==1) last = first;
		return oldFirst.value;
	}
	
	@Override public int indexOf(Integer value) {
		Node current = first;
		int cpt = 0;
		while (current!=null) {
			if(current.value.equals(value))return cpt;
			cpt++;
			current = current.next;
		}
		return -1;
	}
	
	@Override public boolean contains(Integer value) {
		return indexOf(value)>=0;
	}
	
	@Override public int size() {return size;}
	@Override public boolean isEmpty() {		return size==0;	}
	
	@Override public boolean equals(IntegerList comparedList) {
		if(comparedList.size()!=this.size)return false;
		Node thisCurrent = this.first;
		int cpt=0;
		while(thisCurrent!=null) {
			cpt++;
			if(!thisCurrent.value.equals(comparedList.get(cpt))) return false;
			thisCurrent = thisCurrent.next;
		}
		return true;
	}
	
	@Override public Integer remove(int index) {
		checkIndex(index);
		if(index==0) return removeFirst();
		if(index==size-1) return removeLast();
		Node node = getNode(index);
		Node nextNode = node.next;
		Node previousNode = node.previous;
		nextNode.previous = previousNode;
		previousNode.next = nextNode;
		size--;
		return node.value;
	}
	
	@Override public boolean remove(Integer value) {
		if(size==0) return false;
		if(size==1) {
			if(first.value.equals(value)) {
				clear();
				return true;
			}
		}
		Node node = first;
		for(int i=0;i<size-1;i++) {
			if(node.value.equals(value)) {
				// on le supprime
				
				
				if(node.previous==null) {// s'il est premier
					first =node.next;
				}else {
					node.previous.next = node.next;
				}
				
				if(node.next==null) { // il est dernier
					last = node.previous;
				} else {
					node.next.previous = node.previous;
				}
				
				size--;
				return true;
			}
			node = node.next;
		}
		return false;
	}

	@Override
	public void add(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAll(IntegerList da) {
		// TODO Auto-generated method stub
		
	}
	
}
