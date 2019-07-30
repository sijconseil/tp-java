package tp_algo;

public class Tp10Recursivite {
	public static void main(String[] args) {
		for(int i=0;i<100000;i++) {
			System.out.println(inc(i));
		}
	}
	
	public static int inc(int n) {
		if(n==0) return 0;
		return inc(n-1)+1;
	}
	
	public static int factorielle(int n) {
		if(n==1) return 1;
		return n*factorielle(n-1);
	}
}
