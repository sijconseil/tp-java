package data.structure;

public class DynamicArrayQueue<T> implements Queue<T> {

	private T[] array;
	private int startIndex;
	private int endIndex;
	// private int size; // facultatif
	
	
	public DynamicArrayQueue() {
		this(5);
	}
	
	private void clear() {
		startIndex = 0;
		endIndex = 0;
		//size=0;
	}
	
	public DynamicArrayQueue(int capacity) {
		super();
		array = (T[]) new Object[capacity];
		clear();
	}
	
	private void checkSize() {
		// test si place disponible
		
		// si pas de place, agrandit le tableau avec une copie "spéciale"
	}
	
	private int getNextIndex(int index) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void enqueue(T value) {
		// TODO Auto-generated method stub
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
