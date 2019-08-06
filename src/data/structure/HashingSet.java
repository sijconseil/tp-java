package data.structure;

public class HashingSet<T> {

	private T[] array;
	int size = 0;

	public HashingSet() {
		this(10);
	}

	public HashingSet(int initLength) {
		array = (T[]) new Object[initLength];
		size = 0;
	}

	private int getNextIndex(int index) {
		return ( index>=array.length-1 ) ?0:index+1;
	}

	private int getIndexFromHash(T value) {
		return value.hashCode() % array.length;
	}

	private void resize() {
		//TODO
		// bonne nuit les petits....

		// comme pour la Queue en tableau : pensez à réutiliser votre code, ici pas
		// besoin de tout recoder....
	}

	private void checkSize() {
		// TODO
	}

	public void clear() {
		// TODO
	}

	public void addAll(Iterable<T> it) {
		// ainsi on peut avoir une liste ou un autre hashset, si notre hashset implémente
		// iterable

	}

	public int size() {
		return size();
	}
	
	public boolean isEmpty() {return size==0;}

	public void add(T value) {
		checkSize();
		int index = getIndexFromHash(value);
		while (array[index] != null) {
			if (array[index].equals(value))
				return;
			index = getNextIndex(index);
		}
		array[index] = value;
		size++;
	}

	private int indexOf(T value) {
		int index = getIndexFromHash(value);
		while (array[index] != null) {
			if (array[index].equals(value))
				return index;
			index = getNextIndex(index);
		}
		return -1;
	}

	@Override
	public String toString() {
		String s = "DynamicArray [";
		String comma = "";
		for (int i = 0; i < array.length; i++) {
			s += comma + array[i];
			comma = ",";
		}
		s += "]";
		return s;
	}

	public boolean contains(T value) {
		return indexOf(value) >= 0;
	}

	public boolean remove(T value) {
		int index = indexOf(value);
		if (index < 0)	return false;

		size--;
	}

	public static void main(String[] args) {
		HashingSet hs = new HashingSet<>(10);
		System.out.println(hs);
		hs.add(10);
		System.out.println(hs);
		hs.add(9);
		System.out.println(hs);
		hs.add(5);
		System.out.println(hs);
		hs.add(95);
		System.out.println(hs);
		hs.add(89);
		hs.add(11);
		hs.add(109);
		System.out.println(hs);
	}
}
