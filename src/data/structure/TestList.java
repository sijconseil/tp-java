package data.structure;

public class TestList {

	public static void main(String[] args) {
		IntegerList maListe = new SingleChainedList();
		maListe.add(1);
		
//		IntegerChainedList chainedList;
//		chainedList.
	
		maListe.add(2);
		
		/* pour accéder à des méthodes spécifiques à DYnamicArray
		 * Il faut le caster dans le bon type
		 * Si l'instance ne correspond pas, java lève une ClassCastException
		DynamicArray da = (DynamicArray)maListe;
		da.addAllFastAndFurious(null);
		maListe.addAllFastAndFurious(null);
		*/
		System.out.println(maListe.toString());

	}

}
