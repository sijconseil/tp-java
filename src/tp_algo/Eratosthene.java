package tp_algo;

public class Eratosthene {
	
	public static void crible(int n) {
		boolean[] tab = new boolean[n+1];
		for(int i=0;i<tab.length;i++) tab[i]=true;
		
		for(int i=2;i<tab.length/2+1;i++) {
			if(tab[i]) {
				for(int j=i*2;j<tab.length;j+=i) tab[j] = false;
			}
		}

		for(int i=2;i<tab.length;i++) {
			if(tab[i])System.out.println(i);
		}
	}

	public static void main(String[] args) {
		crible(1000);
	}
	
}
