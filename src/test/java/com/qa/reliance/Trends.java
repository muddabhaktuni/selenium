package com.qa.reliance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Trends {
	
	 protected WebDriver driver;


	@BeforeMethod
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.reliancetrends.com/");
		driver.findElement(By.xpath("//*[@id=\"tta-close\"]")).click();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}

	
}
