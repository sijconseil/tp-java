package tp_algo;

public class Tp6Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(7));
		
	}

	public static long fibonacciTab(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		long[] tab = new long[n+1];
		tab[0]=0;
		tab[1]=1;
		for(int i=2;i<=n;i++) {
			tab[i] = tab[i-1]+tab[i-2];
		}
		return tab[n];
	}
	
	
	public static long fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		long prevprev=0;
		long prev=1;
		long current =0;
		for(int i=2;i<=n;i++) {
			current = prevprev+prev;
			prevprev = prev;
			prev = current;
		}
		return current;
	}
	
}
