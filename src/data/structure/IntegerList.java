package data.structure;

public interface IntegerList {
	
	public int size() ;
	public void add(Integer value) ;
	public void addAll(IntegerList da) ;
	public boolean isEmpty() ;
	public boolean contains(Integer value) ;
	public boolean equals(IntegerList list) ;
	public Integer get(int index) ;
	public Integer remove(int index);
	public int indexOf(Integer value);
	public boolean remove(Integer value);
	public void clear();
	
}
