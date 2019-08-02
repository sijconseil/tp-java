package data.structure;

import java.util.ArrayList;

public class TestArrayListObject {
	public static void main(String[] args) {

		
		ArrayList list = new ArrayList();
		
		Integer myInt = new Integer(1);
		Float myFloat = new Float( 1.1);
		list.add(myInt);
		list.add(myFloat);
		
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Integer otherInt = (Integer)list.get(1);
		
	}
}
