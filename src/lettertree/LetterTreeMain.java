package lettertree;

public class LetterTreeMain {
	public static void main(String[] args) {
		LetterTree dico = new LetterTree();
		dico.add("mai");
		dico.add("maison");
		dico.add("mais");
		dico.add("mois");
		dico.remove("mai");
		dico.remove("maison");
		dico.display();
		System.out.println(dico.containsRecursive("mois"));
		System.out.println(dico.containsRecursive("moi"));
		System.out.println(dico.containsRecursive("maison"));
		System.out.println(dico.containsRecursive("maisonnette"));

	}
}
