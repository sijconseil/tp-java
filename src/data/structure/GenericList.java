package data.structure;

public interface GenericList <T>{
	
	public int size() ;
	public void add(T value) ;
	public void addAll(GenericList<T> da) ;
	public boolean isEmpty() ;
	public boolean contains(T value) ;
	public boolean equals(GenericList<T> list) ;
	public T get(int index) ;
	public T remove(int index);
	public int indexOf(T value);
	public boolean remove(T value);
	public void clear();
	
}
