package com.afzal.Lesson2.APP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AssistedPraPro_ParallelTest {
	
	public WebDriver driver;
	
	@Test 
	public void test1() throws InterruptedException {
		System.out.println("I am inside test1 | "+Thread.currentThread().getId());
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.close();
	}
	@Test 
	public void test2() throws InterruptedException {
		System.out.println("I am inside test2 | "+Thread.currentThread().getId());
		
		driver = new ChromeDriver();
		driver.get("http://seleniumhq.org");
		Thread.sleep(3000);
		driver.close();
	}
}
