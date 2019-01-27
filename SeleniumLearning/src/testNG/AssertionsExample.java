package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name="agni";
	boolean value=true;

	@Test
	public void checkEqual(){
		
		/*if(name.equals("Agni")){
			System.out.println("Name is equal");
		}else{
			System.out.println("Name is NOT equal");
		}*/
		
		Assert.assertTrue(value, "This should not be true");
	}
}
