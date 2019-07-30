package tp.objet;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getId());
		
		B b = new B();
		System.out.println(b.getId());
		
		a = b;
		System.out.println(a.getId());
	}
}
