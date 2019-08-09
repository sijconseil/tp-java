package lettertree;

public class TpDico {
	
	public static void main(String[] args) {
		LetterTree tree = new LetterTree();
		try {
			tree.load("C:\\Users\\fabien\\OneDrive\\pro\\_FORMATION\\m2i\\2019 poei\\supports\\_PUBLIC\\liste_francais.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
