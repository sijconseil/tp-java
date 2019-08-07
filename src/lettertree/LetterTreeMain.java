package lettertree;

public class LetterTreeMain {
	public static void main(String[] args) {
		LetterTree dico = new LetterTree();
		dico.add("mai");
		dico.display();
		dico.add("maison");
		dico.display();
		dico.add("mais");
		dico.display();
		dico.add("mois");
		dico.display();
		dico.remove("mai");
		dico.display();
		dico.remove("maison");
		dico.display();
	}
}
