package tp_algo;

public class Tp1Tableaux {
	public static void sommeTableauTaille2() {
	/*	int[] tab = new int[2];
		tab[0] = 10;
		tab[1] = 20;*/
		
		int[] tab = new int[] {10,20};
		System.out.println(tab[0]+tab[1]);
	}
	
	public static void testNPE() {
		int[] tab=null;
		System.out.println(tab[0]);
	}
	
	public static void textIOB() {
		int[] tab = new int[] {10,20};
		System.out.println(tab[3]);
	}
	
	public static int[] testReferenceTableau() {
		int[] tab = new int[1];
		tab[0] = 5;
		System.out.println(tab[0]);

		int[] tab2 = tab;
		System.out.println(tab2[0]);
		
		tab2[0] = 10;
		System.out.println(tab[0]);
		System.out.println(tab2[0]);
		
		return tab;
	}
	
	public static float[] decouperFlottant(float f) {
		float[] res = new float[2];
		
		res[0] = (int) f;
		res[1] = f - res[0];
		
		System.out.println(res[0]+" , "+res[1]);
		return res;
	}
	
	public static int toDate(int jour, int mois, int an) {
		int res = 0;
		
		System.out.println(res);
		return res;
		
	}
	
	public static void main(String[] args) {
		toDate(22,07,2019);
	}
}
