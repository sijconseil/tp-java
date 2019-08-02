package data.structure;

public interface ChainedList<T> extends GenericList<T> {
	
	public void addFirst(T value) ;
	public void addLast(T value);
	public T getFirst();
	public T getLast();
	public T removeLast();
	public T removeFirst();
	

}
