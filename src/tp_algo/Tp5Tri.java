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
		
		return false;
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
	
	public static void triParMin(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			int minIndex = getMinIndex(tab, i);
			int tmp = tab[i];
			tab[i]= tab[minIndex];
			tab[minIndex] = tmp;
		}
	}
	

}
