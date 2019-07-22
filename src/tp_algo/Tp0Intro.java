package tp_algo;

public class Tp0Intro {
	public static void nbSecondesParAn() {
		int nbSecParAn = 365*24*3600;
		System.out.println(nbSecParAn);
	}
	
	public static void inverser() {
		int a = 10;
		int b = 20;
		
		int c= a;
		a = b;
		b = c;
		
		System.out.println(a + " "+b);
	}
	
	public static void decouperDateInt() {
		int date = 20190722;
		int jour = date%100;
		date -=jour;
		date = date/100;
		int mois = date%100;
		int an = date/100;
		System.out.println(jour);
		System.out.println(mois);
		System.out.println(an);
	}

	public static void decouperDateIntBis() {
		int date = 20190722;
		int an=date/10000;
		date -= 10000*an;
		int mois=date/100;
		int jour=date-100*mois;
	
		System.out.println(jour);
		System.out.println(mois);
		System.out.println(an);
	}
	
	public static void partieDecimale() {
		float valeurInitiale = 5.23f;
		int partieEntiere = (int)valeurInitiale;
		float parteDecimale= valeurInitiale - partieEntiere;
		System.out.println(parteDecimale);
	}
	
	public static void main(String[] args) {
		partieDecimale();
		
		
	}
}
