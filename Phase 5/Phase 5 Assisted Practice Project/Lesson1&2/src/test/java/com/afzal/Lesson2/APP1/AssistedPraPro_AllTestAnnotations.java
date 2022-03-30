package com.afzal.Lesson2.APP1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class AssistedPraPro_AllTestAnnotations {

	
		@Test
		public void test1() {
			System.out.println("Test1 is Executed");
		}
		
		@Test
		public void test2() {
			System.out.println("Test2 is Executed");
		}
		
		@BeforeTest
		public void BeforeTest() {
			System.out.println("BeforeTest is Executed");
		}

		@AfterTest
		public void AfterTest() {
			System.out.println("AfterTest is Executed");
		}
		
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("BeforeMethod is Executed");
		}
		
		@AfterMethod
		public void AfterMethod() {
			System.out.println("AfterMethod is Executed");
		}
		
		@BeforeClass
		public void BeforeClass() {
			System.out.println("BeforeClass is Executed");
		}

		@AfterClass
		public void AfterClass() {
			System.out.println("AfterClass Executed");
		}

	}


