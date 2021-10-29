package org.seleniumtask.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pojectphase1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(500);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr1 = ts.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pro.png");
		FileUtils.copyFile(scr1, des1);
		Thread.sleep(200);
		
		driver.findElement(By.className("header_user_info")).click();
		Thread.sleep(40);
		
		driver.findElement(By.id("email_create")).sendKeys("greens@gmail.com");
		Thread.sleep(40);
		
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
//		WebElement gender = driver.findElement(By.className("checked"));
//		gender.click();
//		gender.click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Sridhar");
		Thread.sleep(3000);
		
		driver.findElement(By.id("customer_lastname")).sendKeys("k");
		Thread.sleep(4000);
		
		
		driver.findElement(By.id("passwd")).sendKeys("Ashur@12345");
		Thread.sleep(4000);
		
		WebElement day = driver.findElement(By.id("days"));
		Thread.sleep(40);
		Select da=new Select(day);
		da.selectByValue("2");
		
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.id("months"));
		Thread.sleep(400);
		Select mo=new Select(month);
		mo.selectByValue("2");
	
		
		Thread.sleep(1000);
		WebElement yr = driver.findElement(By.id("years"));
		Thread.sleep(40);
		Select yer=new Select(yr);
		Thread.sleep(500);
		yer.selectByValue("2017");
		
		Thread.sleep(500);
		driver.findElement(By.id("newsletter")).click();
		Thread.sleep(400);
		
		driver.findElement(By.id("firstname")).sendKeys("sridhar");
		Thread.sleep(400);
		
		driver.findElement(By.id("lastname")).sendKeys("k");
		Thread.sleep(400);
		
		driver.findElement(By.id("company")).sendKeys("green");
//		Thread.sleep(400);
//		driver.findElement(By.id("company")).sendKeys("green");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("ramapuram");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("porur");
		Thread.sleep(3000);
		
		driver.findElement(By.id("city")).sendKeys("chennai");
		Thread.sleep(400);
		
		WebElement dw = driver.findElement(By.id("id_state"));
		Thread.sleep(400);
		Select g=new Select(dw);
		g.selectByValue("2");
		Thread.sleep(400);
		
		driver.findElement(By.name("postcode")).sendKeys("12345");
		Thread.sleep(400);
		
//		WebElement con = driver.findElement(By.id("id_country"));
//		Thread.sleep(400);
//		Select c=new Select(con);
//		g.selectByValue("2");
		Thread.sleep(400);
		
		driver.findElement(By.id("other")).sendKeys("HI");
	Thread.sleep(400);
	driver.findElement(By.id("phone_mobile")).sendKeys("8909765432");
	Thread.sleep(400);
		
	driver.findElement(By.id("alias")).sendKeys("Hello");
	Thread.sleep(500);
	TakesScreenshot ts1=(TakesScreenshot)driver;
	File scr2 = ts1.getScreenshotAs(OutputType.FILE);
	File des2 = new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pro1.png");
	FileUtils.copyFile(scr2, des2);
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[.='Register']")).click();
	Thread.sleep(4000);
	
	TakesScreenshot ts2=(TakesScreenshot)driver;
	File scr3 = ts2.getScreenshotAs(OutputType.FILE);
	File des3 = new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pro2.png");
	FileUtils.copyFile(scr3, des3);
	Thread.sleep(500);
	
	
	}

}
