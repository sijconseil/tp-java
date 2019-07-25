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
		Tp2Fonction.abs(-1);
		int[] monTableau = generate(100);
		display(monTableau);
		System.out.println();
		System.out.println("MAX = "+max(monTableau));
		
	}
	
	public static int max(int[] tab) {
		int result = 0;
		for(int i=0;i<tab.length;i++) {
			if(result<tab[i]) {
				result = tab[i];
			}
			
		}
		return result;
	}
	
	public static int min(int[] tab) {
		int result = tab[0];
		for(int i=1;i<tab.length;i++) {
			if(result>tab[i]) {
				result = tab[i];
			}
			
		}
		return result;
	}
	
	public static int sum(int[] tab) {
		int result = 0;
		for(int i=1;i<tab.length;i++) {
			result+=tab[i];
		}
		return result;
	}
	
	public static float average(int[] tab) {
		return ((float)sum(tab))/tab.length;
	}
	
	public static float olympicAverage(int[] tab) {
		// concis et s'appuie sur de code existant, mais 3 parcours de boucle
		return (sum(tab)-min(tab)-max(tab))/((float)tab.length-2);
	}
	
	public static float olympicAverageBis(int[] tab) {
		// un parcous, plus verbeux, plus compliqué, mais plus efficace
		float result = 0;
		int max = tab[0];
		int min = tab[0];
		for(int i=1;i<tab.length;i++) {
			result+=tab[i];
			if(max>tab[i]) { max = tab[i];}
			// BOF BOF LISIBILITE (pour arthur) min=min>tab[i]?tab[i]:min;
			if(min<tab[i]) {
				min = tab[i];
			}
			
		}
		result= result - max - min;
		result/=tab.length-2;
		return result;
		
	}

	
	
	public static int[] generateTabIncremente(int size) {
		int[] result = new int[size];
		int i =0;
		while(i<result.length) {
			result[i]=i+1;
			i++;
		}
		return result;
	}
	
	public static int getRandom() {
		return ((int)(Math.random()*10))%10;
	}
	
	public static int[] generate(int size) {
		int[] result = new int[size];
		int index = 0;
		while(index<result.length) {
			result[index]= getRandom();
			index++;
		}
		
		return result;
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
