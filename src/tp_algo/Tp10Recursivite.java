package tp_algo;

public class Tp10Recursivite {
	public static void main(String[] args) {
		System.out.println(factorielle(5));
	}
	
	public static int factorielle(int n) {
		if(n==1) return 1;
		return n*factorielle(n-1);
	}
}
