package tp_algo;

import java.util.Date;

public class Ap0Cond {
	
	public static void main(String[] args) {
		Date date = new Date(119,6,24);
		long timestamp = date.getTime();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(new Date());
	}

}
