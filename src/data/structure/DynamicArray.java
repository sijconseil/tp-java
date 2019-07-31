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
			increaseSize((int)(array.length*GROWTH_FACTOR));// il faut aggrandir avant d'insérer	
		}
		array[size]=value;
		size++;
	}
	
	public void addAll(DynamicArray da) {// on appelle add pour chaque element
		if(da==this) throw new RuntimeException("trop fainéant !");
		for(int i=0;i<da.size;i++) this.add(da.array[i]);
	}
	
	public void addAllFastAndFurious(DynamicArray da) {
		if(da.size()+this.size>array.length) {
			increaseSize(da.size()+this.size+10);
		}
		for(int i=0;i<da.size;i++) {
			this.array[size+i]=da.array[i];
		}
		this.size+=da.size;
		
	}
	
	public boolean isEmpty() { return size==0;}
	public boolean contains(Integer value) {
		for(int i=0;i<this.size;i++) {// on parcours le tableau et on return true des qu'on trouve la valeur
			if(value.equals(array[i])) return true;
		}
		return false;// retourne false si on arrive a la fin sans avoir trouvé de valeur
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof DynamicArray)) return false;// teste si obj est un (Sous)Type de DynamicArray
		return this.equals((DynamicArray)obj);// si c'est le cas réalise un cast et délègue à la méthode equals ci-dessous
	}
	
	public boolean equals(DynamicArray da) {
		if(this.size!=da.size) return false;// quick win : si taille différente (nombre d'element et non array.length) alors on retourne false
		for(int i= 0;i< size;i++) {// si meme nombre d'elements pour chaque element
			if(!array[i].equals(da.array[i])) return false; // retourne faux à la première différence
		}
		return true;// retourne vrais i aucune différence trouvée
	}
	
	public Integer get(int index) {
		if(index<0 || index >=size) throw new ArrayIndexOutOfBoundsException("L'index ne correspond pas !!!");
		return array[index];
	}
	
	public Integer remove(int index) {
		if(index<0 || index >=size) throw new ArrayIndexOutOfBoundsException("L'index ne correspond pas !!!");
		Integer result = array[index];
		for(int i=index;i<size-1;i++) {
			array[i]=array[i+1];
		}
		array[size-1]=null;
		size--;
		return result;
	}
	
	public int indexOf(Integer value) {
		for(int i=0;i<size;i++) {
			if(array[i].equals(value))return i;
		}
		return -1;
	}
	
	public boolean remove(Integer value) {
		// chercher l'index de la valeur
		int index =indexOf(value);
		if(index<0)return false;
		
		// supprimer la valeur à l'index trouvé
		this.remove(index);
		return true;
		
	}
	
	public void clear() {
		init(5);
	}
	
	

	private void increaseSize(int newSize) {
		Integer[] newArray = new Integer[newSize];
		for(int i=0;i<size;i++) {
			newArray[i]= array[i];
		}
		array = newArray;
	}
	
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
