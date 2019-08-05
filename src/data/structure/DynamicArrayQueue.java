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
		int tmpSize = size();
		if(tmpSize<array.length-2) return;

		// si pas de place, agrandit le tableau avec une copie "spéciale"
		DynamicArrayQueue<T> newQueue = new DynamicArrayQueue<>(array.length*2);
		for(int i=0;i<tmpSize;i++) newQueue.enqueue(this.dequeue());
		
		this.array = newQueue.array;
		this.startIndex = newQueue.startIndex;
		this.endIndex = newQueue.endIndex;
	
	}
	
	private void checkSizeV2() {
		// test si place disponible
		int tmpSize = size();
		if(tmpSize<array.length-2) return;

		// si pas de place, agrandit le tableau avec une copie "spéciale"
		T[] newArray= (T[])new Object[array.length*2];
		int currentIndex = startIndex-1;
		for(int i = 0;i<tmpSize;i++) {
			newArray[i]=array[currentIndex];
			currentIndex = getNextIndex(currentIndex);
		}
		this.startIndex = 0;
		this.endIndex = tmpSize;
		this.array = newArray;
	}
	
	private int getNextIndex(int index) {
		if(index==array.length) {
			return 0;
		}
		return index+1;
	}
	
	@Override
	public void enqueue(T value) {
		array[endIndex] = value;
		endIndex = getNextIndex(endIndex);
	}

	@Override
	public T dequeue() {
		T result = array[startIndex];
		array[startIndex]=null; // dereferencer l'objet pour qu'il soit traité par le garbage collector (gc)
		startIndex = getNextIndex(startIndex);
		return result;
	}

	@Override
	public int size() {
		if(endIndex >startIndex) return endIndex - startIndex;
		return array.length - (startIndex - endIndex);
	}

}
