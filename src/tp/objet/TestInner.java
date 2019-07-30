package tp.objet;

public class TestInner {
	
	private class InnerDyn {
		public String getName() {
			return this.getClass().getName();
		}
	}
	
	private static class InnerStat {
		public String getName() {
			return this.getClass().getName();
		}
	}

	
	public static void main(String[] args) {
		InnerStat stat = new InnerStat();// classe statique : on peut l'instancier à partir 
		// de la classe sans instance de la classe outer qui est TestInner
		System.out.println(stat.getName());
		
		// on ne peut pas instancier innerDyn si on a pas une instance de TestInnner
		TestInner inner = new TestInner();
		
		InnerDyn dyn = inner.new InnerDyn();/// on instancier la inner dyn à partir de l'instance
		// de l'outer
		System.out.println(dyn);
	}
}
