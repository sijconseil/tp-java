package data.structure;

public interface GenericList <T>{
	
	public int size() ;
	public void add(T value) ;
	public void addAll(GenericList<T> da) ;
	public T get(int index) ;
	public T remove(int index);
	public void clear();

	public default boolean equals(GenericList<T> list) {
		if(size()!=list.size()) return false;
		for(int i=0;i< size();i++) {
			if(!get(i).equals(list.get(i)))return false;
		}
		return true;
	}

	public default int indexOf(T value) {
		for(int i=0;i< size();i++) {
			if(!get(i).equals(value))return i;
		}
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
