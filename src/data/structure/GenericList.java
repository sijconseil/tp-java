package data.structure;

import java.util.Iterator;

public interface GenericList <T> extends Iterable<T>{
	
	public int size() ;
	public void add(T value) ;
	public void addAll(GenericList<T> da) ;
	public T get(int index) ;
	public T remove(int index);
	public void clear();

	public default boolean equals(GenericList<T> list) {
		if(size()!=list.size()) return false;
		
		Iterator<T> listIt = list.iterator();
		for(T t: this) {
			if(!t.equals(listIt.next()))return false;
		}
		
// Manipule 2 itérators	
//		Iterator<T> it1 = this.iterator();
//		Iterator<T> it2 = list.iterator();
//		while(it1.hasNext()) {
//			T val1 = it1.next();
//			T val2 = it2.next();
//			if(!val1.equals(val2)) return false;
//		}
		
//      méthode qui nécessite n² opérations sur des listes chainées		
//		for(int i=0;i< size();i++) {
//			if(!get(i).equals(list.get(i)))return false;
//		}
		return true;
	}

	public default int indexOf(T value) {
//		mauvaise solution car implique une complexité de n² pour les liste chainées et je peux le faire en n
//		for(int i=0;i< size();i++) {
//			if(get(i).equals(value))return i;
//		}

		// l'iterateur me permet d'avoir une solution optimale
		Iterator<T> it = this.iterator();
		int cpt=0;
		while(it.hasNext()) {
			T current = it.next();
			if(current.equals(value))return cpt;
			cpt++;
		}
		
		// syntaxe abregée
//		int cpt=0;
//		for(T current: this) {
//			if(current.equals(value))return cpt;
//			cpt++;
//		}
		
		return -1;
	}

	
	public default boolean remove(T value) {
		T t = remove(indexOf(value));
		return t!=null;
	}
	
	public default boolean isEmpty() { return size()==0;}
	public default boolean contains(T value) { return indexOf(value)>=0;}
	public default void display() {		System.out.println(toString());	}
	
}
