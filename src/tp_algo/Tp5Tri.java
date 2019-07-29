package tp_algo;

public class Tp5Tri {
	
	public static void main(String[] args) {
		int[] tab = new int[] {2,5,-3,7,12};
		triParMin(tab);
		Tp4While.display(tab);
		
	}
	
	public static boolean permut(int[] tab) {
		boolean modified = false;
		for(int i=0;i<tab.length-1;i++) {
			if(tab[i]>tab[i+1]) {
				int tmp = tab[i];
				tab[i]= tab[i+1];
				tab[i+1] = tmp;
				modified = true;
			}
		}
		return modified;
	}
	
	public static boolean isPalindrome(char[] word) {
		for(int i=0;i<word.length/2;i++) {
			if(word[i]!=word[word.length-1-i])return false;
		}
		return true;
	}
	
	public static boolean isSubstring(char[] mainString, char[] substring) {
		for(int i=0;i<mainString.length-substring.length+1;i++) {
			if(testSubstringAtIndex(mainString, i, substring))return true;
		}
		return false;
	}
	
	public static boolean testSubstringAtIndex(char[] mainString, int testIndex, char[] substring) {
		
		for(int i=0;i<substring.length;i++) {
			if(i+testIndex>=mainString.length) {
				return false;
			}
			
			if(mainString[i+testIndex]!=substring[i]) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void triPermut(int[] tab) {
		boolean modified= true;
		while(modified) {
			modified = permut(tab);
		}
	}
	
	public static int getMinIndex(int[] tab, int startIndex) {
		int index = startIndex;
		for(int i=startIndex;i<tab.length;i++) {
			if(tab[index]> tab[i])index = i;
		}
		return index;
	}
	
	public static int getMinIndexStr(char[][] tab, int startIndex) {
		int index = startIndex;
		for(int i=startIndex;i<tab.length;i++) {
			if(compare(tab[index], tab[i])>0)index = i;
		}
		return index;
	}
	
	public static void triParMin(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			int minIndex = getMinIndex(tab, i);
			int tmp = tab[i];
			tab[i]= tab[minIndex];
			tab[minIndex] = tmp;
		}
	}
	
	public static void triParMin(char[][] tab) {
		for(int i=0;i<tab.length;i++) {
			int minIndex = getMinIndexStr(tab, i);
			char[] tmp = tab[i];
			tab[i]= tab[minIndex];
			tab[minIndex] = tmp;
		}
	}
	

	public static int compare(char[] str1, char[] str2) {
		int minLength = Tp2Fonction.min(str1.length, str2.length);
		for(int i=0;i<minLength;i++) {
			if (str1[i]>str2[i]) return 1;
			if (str1[i]<str2[i]) return -1;
		}
		if(str1.length>minLength) return 1;
		if(str2.length>minLength) return -1;
		return 0;
	}
	
	public static int compare2(char[] str1, char[] str2) {
		for(int i=0;i<str1.length;i++) {
			if(i>=str2.length)return 1;
			if (str1[i]>str2[i]) return 1;
			if (str1[i]<str2[i]) return -1;
		}
		if(str1.length<str2.length) return -1;
		return 0;
	}
	
	public static void triPermutStr(char[][] tab) {
		boolean modified= true;
		while(modified) {
			modified = permutStr(tab);
		}
	}

	public static boolean permutStr(char[][] tab) {
		boolean modified = false;
		for(int i=0;i<tab.length-1;i++) {
			if(compare(tab[i],tab[i+1])>0) {
				char[] tmp = tab[i];
				tab[i]= tab[i+1];
				tab[i+1] = tmp;
				modified = true;
			}
		}
		return modified;
	}
	
}
