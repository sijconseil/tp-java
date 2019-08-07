package lettertree;

import java.util.ArrayList;
import java.util.List;

public class LetterTree {
	
	private Node root = new Node();
	
	public void add(String word) {
		Node current = root;
		char[] chars = word.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(!current.children.containsKey(chars[i])) {
				Node n = new Node();
				current.children.put(chars[i],n);
			}
			current = current.children.get(chars[i]);
		}
		current.terminal = true;
	}
	
	public void remove(String word) {
		// TODO
	}

	public void display() {
		System.out.println("----------------------------");
		display(root, new char[100], 0);
	}
	
	private void display(Node currentNode, String s) {
		if(currentNode.terminal) System.out.println(s);
		for(Character c : currentNode.children.keySet()) {
			display(currentNode.children.get(c),s+c);
		}
		
	}
	
	private void display(Node currentNode, char[] stack, int length) {
		if(currentNode.terminal) System.out.println(new String(stack,0,length));
		for(Character c : currentNode.children.keySet()) {
			stack[length] = c;
			display(currentNode.children.get(c),stack,length+1 );
		}
		
	}
	
	
	public boolean contains(String word) {
		// TODO
		return false;
	}
	
	public int countNodes() { // retourne le nombre de noeud de l'arbre
		// TODO
		return 0;
	}
	
	public int maxDepth() { // retourne la profondeur maximum de l'arbre
		// TODO
		return 0;
	}
	
	public int countWords() {// retourne le nombre de mots stockés dans l'arbre
		// TODO
		return 0;
	}
	
	public void load(String filePath) { // charge le fichier dont le chemin est donné en paramètre
		// TODO
	}
	
	public List<String> moMoMotus(int length, char firstChar, char endChar){
		List<String> result = new ArrayList<String>();
		
		// enjoy !
		return result;
	}
	
}
