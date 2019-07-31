package tp.objet;

public class TestEquals {
	public static void main(String[] args) {
		System.out.println(new Integer(1).equals(new Integer(1)));
		
		Integer i = 1;
		Integer j = 1;
		System.out.println(i==j);
		
		i=999;
		j=999;
		System.out.println(i==j);
	}

}
