package data.structure;

public interface Queue<T> {

	public void enqueue(T value);
	public T dequeue();
	public int size();
}
