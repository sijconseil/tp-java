package tp_algo;

public class Tp2Fonction {

	public static int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	//	return a>b ? a:b;
		
	}
	
	public static int abs(int a) {
		Integer i;
		if(a>0) {
			return a;
		} else {
			return -a;
		}
//		return a>0 ? a:-a;
	}
	
	public static double compare(double d1, double d2) {
		if(d1>d2) return 1;
		else if (d2>=d1) return -1;
		else return 0;
	}

	public static double compareBis(double d1, double d2) {
		return d1 - d2;
	}
	
	public static double square(double x) {	
		return x*x;
	}
	
	public static double averageDbl(double a, double b) {
		return (a+b)/2;
	}

	public static double averageInt(int a, int b) {
		return ((float)(a+b))/2f;
	}
	
	public static boolean odd(int val) {
		float f = (float)val/2;
		System.out.println("f: "+f);
		
		int entier = (int) f;
		System.out.println("entier: "+entier);
		if(entier==f) { // reste = 0 donc val est entier
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean oddBis(int val) {
		return val%2==1;
	}
	
	public static boolean even(int val) {
		return !oddBis(val);
	}

	public static void main(String[] args) {
		System.out.println(oddBis(2));
		char[] mot = new char[] {'r','a','d','a','r'};
	}
}
