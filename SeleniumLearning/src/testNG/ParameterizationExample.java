package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test
	@Parameters("Name")
	public void printName(String name){
		System.out.println("Name is "+ name);
	}
	
}
