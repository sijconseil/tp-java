package tp_algo;

public class Tp7Intervalle {

	
	public static void main(String[] args) {
		
	}
	
	public static boolean between(long value, long min, long max) {
		return value >= min && value <=max;
	}
	
	public static int toInt(char[] value) {
		// TODO
		return 0;
	}

	public static char[] toChar(int value) {
		// TODO
		return null;
	}
	
	public static boolean overlap(long start1, long end1, long start2, long end2) {
		return false;// TODO
		
		// methode 1 : 4 cas: 
		
		      /*
		       			start1                  end1
		        
		 cas1      start2       end2
		 cas2      start2                                 end2
		 cas3                   start2   end2            
		 cas4                   start2                    end2
		 
		 
		 cas qui chevauchent pas sont : 
		 
		 cas5     start2    end2      start1  end1
		 cas6:    start1    end1     start2   end2
		 
		 Votre mission : 
		 - faire une fonction la plus simple possible .......... (une petite ligne idéalement). 
		 
		 
		       -   TRI PAR MAX/MIN d'un tableau de chaine de caractères
		       -  Afficher les caractères de ‘a’ à ‘z’ suivi de leur code Unicode : remarque quant on convertit un caractère en entier, cela retourne l’index dans la table des caractères (et réciproquement)
		      -   Compter le nombre de caractères blancs d’une chaine de caractères. 
			- Supprimer les caractères blancs au début et à la fin d’une chaine de caractères (caractère blanc: espace, tab (\t) )
Convertir en entier un nombre obtenu en chaine de caractères et réciproquement

 int i = 123450 <<==>> char[] tab = new char[]{1,2,3,4,5,0};

		       **/
		
	}
}
