package tp.objet;

//import tp.objet.TestInner.InnerDyn;
//import tp.objet.TestInner.InnerStat;

public class TestInnerOther {
	// ne compile pas si je mets les classes de TestInner en private
	/*
	public static void main(String[] args) {
		InnerStat stat = new TestInner.InnerStat();// classe statique : on peut l'instancier à partir 
		// de la classe sans instance de la classe outer qui est TestInner
		System.out.println(stat.getName());
		
		// on ne peut pas instancier innerDyn si on a pas une instance de TestInnner
		TestInner inner = new TestInner();
		
		InnerDyn	 dyn = inner.new InnerDyn();/// on instancier la inner dyn à partir de l'instance
		// de l'outer
		System.out.println(dyn);
	}*/
}
