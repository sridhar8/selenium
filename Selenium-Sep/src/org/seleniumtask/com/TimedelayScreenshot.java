package org.seleniumtask.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimedelayScreenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	Thread.sleep(1000);
	WebElement name = driver.findElement(By.id("userName"));
	name.sendKeys("sridhar k");
	Thread.sleep(1200);
	
	WebElement mail = driver.findElement(By.id("userEmail"));
	mail.sendKeys("sridharsarvesh@gmail.com");
	Thread.sleep(1500); 
	
	WebElement address = driver.findElement(By.id("currentAddress"));
	address.sendKeys("lnt");
	Thread.sleep(800);

	WebElement padd = driver.findElement(By.id("permanentAddress"));
	padd.sendKeys("dell");
	Thread.sleep(4000);

	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File ss = ts1.getScreenshotAs(OutputType.FILE);
	File bf4=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\qa.png");
	FileUtils.copyFile(ss, bf4);
	
//	WebElement sub = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	WebElement sub = driver.findElement(By.id("submit"));
	boolean selected = sub.isSelected();
	System.out.println(selected);
	sub.click();
	
	TakesScreenshot ts2= (TakesScreenshot)driver;
	File ss2=ts2.getScreenshotAs(OutputType.FILE);
	File last=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\qa.last.png");
FileUtils.copyFile(ss2, last)	;
Thread.sleep(2000);

//driver.navigate().back();
//Thread.sleep(1000);
//driver.close();
}
}
