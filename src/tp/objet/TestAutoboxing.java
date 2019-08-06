package tp.objet;

public class TestAutoboxing {

	public static void main(String[] args) {
		Integer[] tab = new Integer[3];
		String result = "";
		tab[1] = 3;
		for(int i=0;i<tab.length;i++) {
			result+="-"+tab[i];
		}
		System.out.println(result);
	}
	
	
}
