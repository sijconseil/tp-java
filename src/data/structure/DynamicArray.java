package data.structure;

public class DynamicArray<T> implements GenericList<T>{
	public static final float GROWTH_FACTOR = 1.5f;
	
	private T[] array;// contient le tableau qui n'est pas redimensionnable des valeurs
	private int size;// contient le nombre de valeurs stockées dans le tableau qui est rempli de 0 à size-1
	
	private void init(int size) {// instancie et initialise les attributs de ma classe depuis les constructeurs
		array = (T[])new Object[size];
		this.size = 0;
	}
	
	public DynamicArray() {// constructeur par défaut : taille initiale de 5
		super();
		init(5);
	}

	public DynamicArray(int _size) {// on peut instancier directement un tableau
		// avec une taille données si on sait combien on a d'éléments
		super();
		init(_size);
	}
	
	@Override public int size() {
		return size;
	}
	
	
	@Override public void add(T value) {
		if(size==array.length) {
			increaseSize((int)(array.length*GROWTH_FACTOR));// il faut aggrandir avant d'insérer	
		}
		array[size]=value;
		size++;
	}
	
	@Override public void addAll(GenericList<T> da) {// on appelle add pour chaque element
		if(da==this) throw new RuntimeException("trop fainéant !");
		
		if(da instanceof DynamicArray) {
			this.addAllFastAndFurious((DynamicArray<T>)da);
		} else {
			for(int i=0;i<da.size();i++) this.add(da.get(i));
		}
	}
		
	public void addAllFastAndFurious(DynamicArray<T> da) {
		if(da.size()+this.size>array.length) {
			increaseSize(da.size()+this.size+10);
		}
		for(int i=0;i<da.size;i++) {
			this.array[size+i]=da.array[i];
		}
		this.size+=da.size;
		
	}
	
	
	
	@Override public T get(int index) {
		if(index<0 || index >=size) throw new ArrayIndexOutOfBoundsException("L'index ne correspond pas !!!");
		return array[index];
	}
	
	@Override public T remove(int index) {
		if(index<0 || index >=size) throw new ArrayIndexOutOfBoundsException("L'index ne correspond pas !!!");
		T result = array[index];
		for(int i=index;i<size-1;i++) {
			array[i]=array[i+1];
		}
		array[size-1]=null;
		size--;
		return result;
	}
	
	@Override public void clear() {
		init(5);
	}
	
	private void increaseSize(int newSize) {
		T[] newArray = (T[])new Object[newSize];
		for(int i=0;i<size;i++) {
			newArray[i]= array[i];
		}
		array = newArray;
	}
	
	@Override public String toString() {
		String s= "DynamicArray [";
		String comma = "";
		for(int i=0;i<size;i++) {
			s+=comma+array[i];
			comma=",";
		}
		s+="]";
		return s;
	}
	
}
