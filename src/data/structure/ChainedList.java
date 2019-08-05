package data.structure;

public interface ChainedList<T> extends GenericList<T>, Queue<T>, Stack<T> {
	
	public void addFirst(T value);
	public default void addLast(T value){add(value);}
	public default T getFirst() { return get(0);}
	public default T getLast() { return get(size()-1);}
	public default T removeLast() {return remove(size()-1);}
	public default T removeFirst() { return remove(0);}
	
	@Override	public default void enqueue(T value) {		addFirst(value);	}
	@Override	public default T dequeue() {		return removeLast();	}
	@Override	public default void push(T value) {		addFirst(value);	}
	@Override	public default T pop() {		return removeFirst();	}
	
	

}
