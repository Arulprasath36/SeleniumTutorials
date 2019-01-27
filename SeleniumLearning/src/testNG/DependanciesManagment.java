package testNG;

import org.testng.annotations.Test;

public class DependanciesManagment {

	
//Problem1: You have to Admit a student To engineering
//Problem2: You have to Admit a student To higher secondary

	@Test(enabled=true)
	public void highSchool(){
		System.out.println("High school");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary(){
		System.out.println("Higher sec school");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering(){
		System.out.println("college");
	}
}
