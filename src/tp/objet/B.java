package tp.objet;

public class B extends A implements I {
	
	public static int VALUE = 2;

	@Override public int getId() {return 2;}

	@Override
	public String getName() {
		return "My name is B, James B";
	}
	
	
	public static void main(String[] args) {
		I i = new B();
		System.out.println(i.getName());
		
		i = new I() {// accolade juste après les parenthèse = nouvelle classe
			
			@Override // montre qu'on redefinit une méthode présente dans une classe parente, ici l'interface I
			public String getName() {
				return "you don't know my name";
			}
		};// a la fin des accollades, on a un point virgule pour terminer l'instruction. 
		System.out.println(i.getName());
		
		B b = new B() {// ici j'ai un corps de classe donc classe anonyme heritant de B
			@Override // contrairement à l'interface pas obligé de redéfinir car on peut réutiliser celle de B. 
			public String getName() {
				return "Another body";
			}
		};
		System.out.println(b.getName());
		b = new B();// instance de B tout simple
		System.out.println(b.getName());
	}
}
