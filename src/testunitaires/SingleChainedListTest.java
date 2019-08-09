package testunitaires;

import org.junit.Test;

import data.structure.SingleChainedList;
import junit.framework.Assert;

public class SingleChainedListTest {
	@Test public void testException(){
		SingleChainedList<Integer> list = new SingleChainedList<>();
		try {
			list.remove(1);
			Assert.fail();
		} catch (Exception e) {
			System.out.println("on fait rien car ca se passe bien");
		}
	}
	
	@Test public void testPremier(){
		SingleChainedList<Integer> list = new SingleChainedList<>();
		list.add(1);
		Assert.assertTrue("taille initiale est égale à 0", list.size()==0);
		System.out.println("Coucou");
	}

	@Test public void testSecond(){
		SingleChainedList<Integer> list = new SingleChainedList<>();
		Assert.assertTrue("taille initiale est égale à 0", list.size()==0);
		System.out.println("Coucou");
	}


}
