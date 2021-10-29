package org.selenium.concept.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
						//also see in task dropdownselection

public class Dropdown {
	
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotsconcepts\\fb.initial.png");
		FileUtils.copyFile(s,d);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("greenstech");
//		driver.findElement(By.name("firstname")).sendKeys("greenstech");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ramapuram");	//by using index based xpath
//		driver.findElement(By.name("lastname")).sendKeys("oppositeL&T");
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("8190983883");
		Thread.sleep(150);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123@Asdcb");
		Thread.sleep(500);
		
		WebElement date=driver.findElement(By.id("day"));
//		date.click();
		Select day = new Select(date);
		Thread.sleep(500);
		day.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement month =driver.findElement(By.name("birthday_month"));
		Select mont=new Select(month);
		Thread.sleep(4000);						//Select class on index base 
		mont.selectByIndex(3);				//most of the time we cant choose index bases bcz of index value change time by time
		Thread.sleep(4000);
		
		WebElement monthh =driver.findElement(By.name("birthday_month"));
		Select mon=new Select(monthh);			//Select class on value base
		Thread.sleep(2000);					//we can use value base at any time 
		mon.selectByValue("7");
		Thread.sleep(2000);
		
//		WebElement m =driver.findElement(By.name("birthday_month"));
//		Select mo=new Select(m);				//Select class on visible text base
//		Thread.sleep(2500);						//its not working properly
//		mo.selectByVisibleText("Oct");
//		Thread.sleep(1000);
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		File de=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotsconcepts\\fb.lastt.png");
		FileUtils.copyFile(sr,de);
		Thread.sleep(1000);
		
		 driver.close();
	}

	}


