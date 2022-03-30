package com.afzal.Lesson1.APP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssistedPraPro2_XPath_As_CSS_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://signup.heroku.com/");
	        //1. find element using tag and id ==> tagname#idvalue
	        
	        driver.findElement(By.cssSelector("input#first_name")).sendKeys("Afzal");
	        
	        // tag and attribute
	        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Hussain");
	        
	        driver.findElement(By.cssSelector("input#email")).sendKeys("Afzal@gmail.com");
	}

}
