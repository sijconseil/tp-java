package data.structure;

public interface IntegerChainedList extends IntegerList {
	
	public void addFirst(Integer value) ;
	public void addLast(Integer value);
	public Integer getFirst();
	public Integer getLast();
	public Integer removeLast();
	public Integer removeFirst();
	

}
