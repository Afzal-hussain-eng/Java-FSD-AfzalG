package com.afzal.Lesson2.APP4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AssistedPraPro_sSetUpSeleniumGrid {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
	//	String hubURL= "http://192.168.1.14:4545/wd/hub";
		
		// RemoteWebDriver()
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.118:4545/wd/hub"),options);
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
