package lettertree;

public class LetterTreeMain {
	public static void main(String[] args) {
		LetterTree dico = new LetterTree();
		dico.add("mai");
		dico.add("maison");
		dico.add("mais");
		dico.add("mois");
		dico.display();
		dico.remove("mai");
		dico.display();
		dico.remove("maison");
		dico.display();
		dico.remove("mais");
		dico.remove("mois");
		dico.display();

	}
}
