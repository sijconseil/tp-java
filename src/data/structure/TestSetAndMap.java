package data.structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class TestSetAndMap {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		set.add("toto");
		set.contains("toto");
		set.remove("toto");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("13", " valeur 3");
		map.put("5", " les doigts de la main");
		map.put("10", "tous les orteils");
		
		/*for(String key: map.keySet()) {
			System.out.println("KEY = "+key+ "   VALUE = "+map.get(key));
		}*/
		
		for(Entry<String, String> entry: map.entrySet()) {
			System.out.println("KEY = "+entry.getKey()+ "   VALUE = "+entry.getValue());
			
		}
		
		for(String value: map.values()) {
			System.out.println(value);
		}
		

	}

}
