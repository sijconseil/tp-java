package data.structure;

public class DynamicArrayStack<T> implements Stack<T>{
	
	private DynamicArray<T> array;
	
	public DynamicArrayStack() {		this(5);	}
	
	public DynamicArrayStack(int capacity) {
		super();
		array = new DynamicArray<>(capacity);
	}
	
	@Override	public void push(T value) {		array.add(value);	}
	@Override	public T pop() {		return array.remove(size()-1);	}
	@Override	public int size() {		return array.size();	}

}
