package data.structure;

public class SingleChainedList<T> implements ChainedList<T> {
	
	private static class Node<T> {
		Node<T> next;
		T value;
		public Node(T val) {
			this.value = val;
		}
		public Node(T val, Node<T> nxt) {
			this.value = val;
			this.next = nxt;
		}
	}
	
	private Node<T> first;
	private int size;
	
	@Override public void addFirst(T i) {
		Node<T> node = new Node<>(i); // j'instancie un nouveau noeud et je lui affecte la valeur voulue
		node.next = first; // permet de gerer que si la liste était non vide, l'ancien
		// premier noeud devient le successeur du nouveau noeud
		first = node;// le nouveau noeud devient le premier de la liste. 
		size++;
	}
	
	public void display() {
		System.out.print("[");
		Node<T> currentNode = first;
		String comma = "";
		while(currentNode!=null) {
			System.out.print(comma+currentNode.value);
			comma=",";
			currentNode = currentNode.next;
		}
		System.out.print("]\n");
	}

	
	private Node<T> getNode(int index) {
		checkIndex(index);
		Node<T> current = first;
		for(int i=0;i<index-1;i++) {
			current = current.next;
		}
		return current;
	}
	
	private void checkIndex(int index) {
		if(index<0) throw new ArrayIndexOutOfBoundsException("The index must be strictly positive");
		if(index>=size) throw new ArrayIndexOutOfBoundsException("The index must be less than the size");
	}
	
	@Override public T get(int index) {
		Node<T> node = getNode(index);
		if(node==null) return null;
		return node.value;
	}
	
	@Override public T getFirst() {		return get(0);	}
	@Override public T getLast() {		return get(size-1);	}
	
	@Override public void clear() {
		first = null;
		size=0;
	}
	
	@Override public T removeLast() {		return remove(size-1);	}
	
	@Override public T removeFirst() {return remove(0);	}
	
	@Override public void addLast(T value) {
		Node<T> last = getNode(size-1);
		last.next = new Node<>(value);
		size++;
	}
	
	@Override public int indexOf(T value) {
		Node<T> current =first;
		int cpt =0;
		while (current!=null) {
			if(current.value.equals(value))return cpt;
			current = current.next;
			cpt++;
		}
		return -1;
	}
	
	@Override public boolean contains(T value) {
		return indexOf(value)>=0;
	}
	
	@Override public int size() {return size;}
	@Override public boolean isEmpty() {		return size==0;	}
	
	@Override public boolean equals(GenericList<T> comparedList) {
		if(size!=comparedList.size())return false;

		Node<T> current = this.first;
		for(int i=0;i<size;i++) {
			if(!current.value.equals(comparedList.get(i))) {
				return false;
			}
			current = current.next;
		}
		return true;
	}
	
	@Override public T remove(int index) {
		checkIndex(index);
		
		if(index==0) {
			T res = first.value;
			first = first.next;
			size--;
			return res;
		}
		
		Node<T> previous = getNode(index-1);
		T res = previous.next.value;
		previous.next= previous.next.next;
		size--;
		
		return res;
		
	}
	
	@Override public boolean remove(T value) {
		// return remove(indexOf(value)); // deux parcours au lieu d'un, mais sympa quand on en a un peu marre... 

		if(first==null) {// premier cas: la liste est vide
			return false;
		}
		
		if(first.value.equals(value)) {// deuxieme cas: la valeur est sur le premier élément
			removeFirst();
			return true;
		}
		
		Node<T> current = first;
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
	public void add(T value) {
		this.addLast(value);
	}

	@Override
	public void addAll(GenericList<T> da) {
		Node<T> current = getNode(size-1);
		for(int i=0;i<da.size();i++) {
			Node<T> toAdd = new Node<>(da.get(i));
			current.next = toAdd;
			current = toAdd;
		}
		this.size+=da.size();
	}
	
	
	
	
}
