package tp_algo;

public class Tp4While {
	
	public static double power(double val, int pow) {
		double result = 1;
		int cpt = 0;
		while(cpt<pow) {
			result*=val;
			// PAS BON boucle infinie cpt=cpt++;
			// MARCHE mais risqué ! cpt=++cpt;
			cpt++;
			// OK cpt=cpt+1;
			// OK cpt+=1;
		}
		return result;
	}
	
	public static void main(String[] args) {
	/*	display(generate(5));
		
		int i = 0;
		while(i<20) {
			System.out.println(getRandom());
			i++;
		}*/
	//	int[] sampleTab = new int[] {1,2,3};
		int[] tableauGenere = generate(3);
		display(tableauGenere);
	//	display2(sampleTab);
		//System.out.println(sum(100));
	}
	
	public static int getRandom() {
		return ((int)(Math.random()*10))%10;
	}
	
	public static int[] generate(int size) {
		// TODO
		return null;
	}
	
	public static void display(int[] tab) {
		int index = 0;
		System.out.print('[');
		while(index<tab.length) {
			System.out.print(tab[index]);
			if(index<tab.length-1) {
				System.out.print(',');
			}
			index++;
		}
		System.out.print(']');
		// TODO
	}
	
	
	public static void display2(int[] tab) {
		int index = 0;
		System.out.print('[');
		String comma = "";
		while(index<tab.length) {
			System.out.print(comma);
			System.out.print(tab[index]);
			comma = ",";
			index++;
		}
		System.out.print(']');
		// TODO
	}
	
	public static int sum(int cpt) {
		int total = 0;
		for(int i=0;i<=cpt;i++)total+=i;
		return total;
	}	
}
