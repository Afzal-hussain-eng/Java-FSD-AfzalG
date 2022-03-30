package com.afzal.Lesson1.APP6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssistedPraPro_Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.ebay.com.au/");

//	       TakesScreenshot ts = (TakesScreenshot)driver;
//	       
//	       File scr = ts.getScreenshotAs(OutputType.FILE);
	       
	       
	       File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       
	 
	       FileUtils.copyFile(sc, new File(".//Screenshot/screen.png"));
	       

	}

}
