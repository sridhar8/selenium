package org.seleniumtask.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Twitterlogin {
	
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/signup");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\Twit.ini.png");
		FileUtils.copyFile(scr, des);
Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sridhar");
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("9203293029");
		
		WebElement month=driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
		Thread.sleep(100);
		Select mon=new Select(month);
		Thread.sleep(1000);
		mon.selectByValue("2");
		boolean multiple = mon.isMultiple();
		System.out.println(multiple);
		
		WebElement day=driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));
		Thread.sleep(200);
		Select date=new Select(day);
		date.selectByValue("4");
		Thread.sleep(1000);
		
		WebElement year=driver.findElement(By.xpath("(//select[@aria-invalid='false'])[3]"));
		Thread.sleep(200);
		Select yr=new Select(year);
		yr.selectByValue("2000");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Next']")).click();	
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File scr1=ts1.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\Twit.fin.png");
		FileUtils.copyFile(scr1, des1);
		
		Thread.sleep(300);
		driver.findElement(By.xpath("(//span[.='Next'])[2]")).click();
	}

}
