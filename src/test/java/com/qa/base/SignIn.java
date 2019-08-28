package com.qa.base;

//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.reliance.Trends;

public class SignIn extends Trends {


	@Test(priority=1)
	public void init() throws InterruptedException
	{

		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.id("j_username")).sendKeys("erripappa");
		driver.findElement(By.id("j_password")).sendKeys("Erripapp@");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[1]/div/div[9]/a")).click();
		Thread.sleep(9000);
	}
	
	@Test(priority=2)
	public void loginpass() throws InterruptedException
	{
		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.id("j_username")).sendKeys("blahargav@gmail.com");
		driver.findElement(By.id("j_password")).sendKeys("Bondabajji007");
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(10000);
		

}
	@Test(priority=3)
	public void LocateStores() throws InterruptedException
	{
		driver.findElement(By.linkText("LOCATE STORES")).click();
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[@name='storename']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @name='button' and @id='desktopSearch']")).click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=4)
	public void Shop() 
	{
		driver.findElement(By.linkText("SHOP")).click();
	}
	
	@Test(priority=5)
	public void ContactUs()
	{
		driver.findElement(By.linkText("CONTACT US")).click();
	}
}
