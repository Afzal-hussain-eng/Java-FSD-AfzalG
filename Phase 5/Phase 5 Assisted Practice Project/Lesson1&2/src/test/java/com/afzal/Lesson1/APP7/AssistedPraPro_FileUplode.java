package com.afzal.Lesson1.APP7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssistedPraPro_FileUplode {
	
	public WebDriver driver;
	
	public AssistedPraPro_FileUplode() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@Test
	public void chromeprog()
	{
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file'][2]")).sendKeys("C:\\Users\\hp\\Desktop\\Text.txt");
	}

}
