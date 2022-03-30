package com.afzal.Lesson2.APP3;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssistedPraPro_TestAssertions {
	SoftAssert soft = new SoftAssert();
   
	@Test
	public void test1() {
		System.out.println("Open Browser");
		
		Assert.assertEquals(true, true);//hard assertion 
		//if the assertion fail here then the reaming test case will not be executed and the program will shut down here only.
		
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click on the signin button");
		
		Assert.assertEquals(true, true);
		
		
		System.out.println("validating home page");
		
		soft.assertEquals(true, false," home page title missing");//soft assertion 
		
		System.out.println("go to deals page");
		
		System.out.println("create a deals page");
		
		soft.assertEquals(true, false," unable to create a deals page");//soft assertion 
		
		System.out.println("go to contacts page");
		
		System.out.println("Create a contact");
		
		soft.assertEquals(true, false," not able to create contact");//soft assertion 
		
		soft.assertAll();
	}
	
	@Test
	public void test2() {
		System.out.println("logout");
		soft.assertEquals(true, false);
		soft.assertAll();
	}
	
	
	@AfterClass
	public void tearDown() {
	}
}


