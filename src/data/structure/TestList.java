package data.structure;

public class TestList {

	public static void main(String[] args) throws Exception {
		
		GenericList<Float> floatList = new DynamicArray<Float>();
		floatList.add(1.2f);
		floatList.add(1.2f);
		floatList.add(1.2f);
		floatList.add(1.2f);
		for(Float f: floatList) {
			System.out.println(f);
		}
		System.out.println("fini!");
	}

}
