package tp_algo;

public class Tp8Encoding {
	// Afficher les caractères de ‘a’ à ‘z’ suivi de leur code Unicode : 
	// remarque quand on convertit un caractère en entier, cela retourne l’index dans la table des caractères (et réciproquement)
	public static void alphabet() {
		char a = 'a';
		System.out.println(a);
		
		int codeA = a;
		System.out.println(codeA);
		System.out.println((char)97);
		System.out.println("unicode: \u0061");
		
		for(int i= 0;i<26;i++) {
			char c =(char)( i+'a');
			System.out.println("sol 1 : "+c+ " "+((int)c) );
		}
		for(char c = 'a'; c<='z';c++) {
			System.out.println("sol2 : "+c+ " "+((int)c));
		}
		System.out.println();
	}
	public static boolean isBlanck(char c) {
		return c==' ' || c=='\n' || c=='\t';
	}
	// 	 Compter le nombre de caractères blancs d’une chaine de caractères. 
	public static int countBlankChars(char[] str) {
		int cpt = 0;
		for(int i=0;i<str.length;i++) {
			if(isBlanck(str[i]))cpt++;
		}
		return cpt;
	}
	
	// Supprimer les caractères blancs au début et à la fin d’une chaine de caractères (caractère blanc: espace, tab (\t) )
	public static char[] trim(char[] str) {
		int indexFirstChar = 0;
		for(int i=0;i<str.length;i++) {
			if(!isBlanck(str[i])) {
				indexFirstChar = i;
				break;
			}
		}
		
		int indexLastChar = 0;
		for(int i=str.length-1;i>=0;i--) {
			if(!isBlanck(str[i])) {
				indexLastChar = i;
				break;
			}
		}
		
		if(indexLastChar==0) {
			return null;
		}
		char[] result = new char[indexLastChar-indexFirstChar+1];
		for(int i=0;i<result.length;i++) {
			result[i] = str[i+indexFirstChar];
		}
		return result;
		
		
		
	}
	
	// Supprimer les caractères blancs au début et à la fin d’une chaine de caractères (caractère blanc: espace, tab (\t) )
		public static char[] trimWhile(char[] str) {
			int indexFirstChar = 0;
			while(isBlanck(str[indexFirstChar]) && indexFirstChar<str.length) {
					indexFirstChar++;
			}

			int indexLastChar = str.length-1;
			while(isBlanck(str[indexLastChar]) && indexLastChar>=0) {
				indexLastChar--;
			}
			
			if(indexLastChar<=indexFirstChar) {
				return null;
			}
			
			char[] result = new char[indexLastChar-indexFirstChar+1];
			for(int i=0;i<result.length;i++) {
				result[i] = str[i+indexFirstChar];
			}
			return result;
			
			
			
		}
	
	public static void main(String[] args) {
		System.out.println(countChars(123));
		System.out.println(new String(toChar(123)));
	}
		
	public static int toInt(char[] value) {
		// TODO
		return 0;
	}
	
	public static int countChars(int value) {
		int cpt = 0;
		while (value>0) {
			value=value/10;
			cpt++;
		}
		return cpt;
	}

	public static char[] toChar(int value) {
		int currentValue = value;
		int size = countChars(value);
		char[] res  = new char[size];
		for(int i= 0;i<size;i++) {
			res[size-i-1]=(char)(currentValue%10+'0');
			currentValue=currentValue/10;
		}
		return res;
	}
	
	
	/* 
Convertir en entier un nombre obtenu en chaine de caractères et réciproquement

 int i = 123450 <<==>> char[] tab = new char[]{1,2,3,4,5,0};

	  */

}
