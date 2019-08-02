package data.structure;

public class SingleChainedList implements IntegerChainedList {
	
	private static class Node {
		Node next;
		Integer value;
		public Node(Integer val) {
			this.value = val;
		}
		public Node(Integer val, Node nxt) {
			this.value = val;
			this.next = nxt;
		}
	}
	
	private Node first;
	private int size;
	
	@Override public void addFirst(Integer i) {
		Node node = new Node(i); // j'instancie un nouveau noeud et je lui affecte la valeur voulue
		node.next = first; // permet de gerer que si la liste était non vide, l'ancien
		// premier noeud devient le successeur du nouveau noeud
		first = node;// le nouveau noeud devient le premier de la liste. 
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

	
	private Node getNode(int index) {
		checkIndex(index);
		Node current = first;
		for(int i=0;i<index-1;i++) {
			current = current.next;
		}
		return current;
	}
	
	private void checkIndex(int index) {
		if(index<0) throw new ArrayIndexOutOfBoundsException("The index must be strictly positive");
		if(index>=size) throw new ArrayIndexOutOfBoundsException("The index must be less than the size");
	}
	
	@Override public Integer get(int index) {
		Node node = getNode(index);
		if(node==null) return null;
		return node.value;
	}
	
	@Override public Integer getFirst() {		return get(0);	}
	@Override public Integer getLast() {		return get(size-1);	}
	
	@Override public void clear() {
		first = null;
		size=0;
	}
	
	@Override public Integer removeLast() {		return remove(size-1);	}
	
	@Override public Integer removeFirst() {return remove(0);	}
	
	@Override public void addLast(Integer value) {
		Node last = getNode(size-1);
		last.next = new Node(value);
		size++;
	}
	
	@Override public int indexOf(Integer value) {
		Node current =first;
		int cpt =0;
		while (current!=null) {
			if(current.value.equals(value))return cpt;
			current = current.next;
			cpt++;
		}
		return -1;
	}
	
	@Override public boolean contains(Integer value) {
		return indexOf(value)>=0;
	}
	
	@Override public int size() {return size;}
	@Override public boolean isEmpty() {		return size==0;	}
	
	@Override public boolean equals(IntegerList comparedList) {
		if(size!=comparedList.size())return false;

		Node current = this.first;
		for(int i=0;i<size;i++) {
			if(!current.value.equals(comparedList.get(i))) {
				return false;
			}
			current = current.next;
		}
		return true;
	}
	
	@Override public Integer remove(int index) {
		checkIndex(index);
		
		if(index==0) {
			Integer res = first.value;
			first = first.next;
			size--;
			return res;
		}
		
		Node previous = getNode(index-1);
		Integer res = previous.next.value;
		previous.next= previous.next.next;
		size--;
		
		return res;
		
	}
	
	@Override public boolean remove(Integer value) {
		// return remove(indexOf(value)); // deux parcours au lieu d'un, mais sympa quand on en a un peu marre... 

		if(first==null) {// premier cas: la liste est vide
			return false;
		}
		
		if(first.value.equals(value)) {// deuxieme cas: la valeur est sur le premier élément
			removeFirst();
			return true;
		}
		
		Node current = first;
		while(current.next!=null && !current.next.value.equals(value)) {
			// tant que le successeur du noeud courant ne contient pas la valeur rechercher
			// et tant qu'il y a un successeur, alors on déplace le curseur
			current = current.next;
		}
		if(current.next!=null) {
			// si on trouve la valeur, on sort de la boucle en s'arretant sur le prédécesseur
			// de la valeur recherchée
			current.next = current.next.next;
			size--;
			return true;
		}else {
			// si on n'a pas trouvé la valeur, en sortant de la boucle, ca veut dire
			return false;
		}
		
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
