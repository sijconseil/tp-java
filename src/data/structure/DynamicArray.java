package data.structure;

public class DynamicArray {
	public static final float GROWTH_FACTOR = 1.5f;
	
	private Integer[] array;// contient le tableau qui n'est pas redimensionnable des valeurs
	private int size;// contient le nombre de valeurs stockées dans le tableau qui est rempli de 0 à size-1
	
	private void init(int size) {// instancie et initialise les attributs de ma classe depuis les constructeurs
		array = new Integer[size];
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
	
	public int size() {
		return size;
	}
	
	
	public void add(Integer value) {
		if(size==array.length) {
			Integer[] newArray = new Integer[(int)(array.length*GROWTH_FACTOR)];
			for(int i=0;i<size;i++) {
				newArray[i]= array[i];
			}
			array = newArray;
//			increaseSize();// il faut aggrandir avant d'insérer	
		}
		array[size]=value;
		size++;
	}
	
	public void clear() {
		init(5);
	}

/*	private void increaseSize() {
		Integer[] newArray = new Integer[(int)(array.length*GROWTH_FACTOR)];
		for(int i=0;i<size;i++) {
			newArray[i]= array[i];
		}
		array = newArray;
	}*/
	
	public String toString() {
		String s= "Coucou [";
		String comma = "";
		for(int i=0;i<size;i++) {
			s+=comma+array[i];
			comma=",";
		}
		s+="]";
		return s;
	}
}
