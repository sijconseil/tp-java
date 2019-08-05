package data.structure;

public class ImmutableDynamicArray<T> extends DynamicArray<T>{
	
	public ImmutableDynamicArray(GenericList<T> initValues) {
		super(initValues.size());
		super.addAll(initValues);
		
	}

	@Override public void add(T value) {
		throw new RuntimeException("This is an immutable instance");
	}
	
	@Override
	public void addAll(GenericList<T> da) {
		throw new RuntimeException("This is an immutable instance");
	}
	
	@Override public T remove(int index) {
		throw new RuntimeException("This is an immutable instance");
	}
	
	@Override public boolean remove(T value) {
		throw new RuntimeException("This is an immutable instance");
	}
	
	@Override public void clear() {
		throw new RuntimeException("This is an immutable instance");
	}
}
