package data.structure;

public class TestList {

	public static void main(String[] args) throws Exception {
		
		GenericList<Float> floatList = new DynamicArray<Float>();
		floatList.add(1.1f);
		floatList.add(1.2f);
		floatList.add(1.3f);
		System.out.println(floatList.get(0));
		
		GenericList<Float> immutableList = new ImmutableDynamicArray<>(floatList);
		System.out.println("Immutable: "+immutableList);
		floatList.add(2.3f);
		
		System.out.println("Floatlist: "+floatList);
		System.out.println("Immutable: "+immutableList);
		try {
			
		immutableList.add(2.3f);
		System.out.println("Ca se passe trop bien!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("terminé mal !!!");
		} finally {
		System.out.println("terminé finally!");
		}
		System.out.println("toto");
	}

}
