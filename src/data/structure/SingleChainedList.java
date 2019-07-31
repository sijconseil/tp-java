package data.structure;

public class SingleChainedList {
	
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
	
	public void addFirst(Integer i) {
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

}
