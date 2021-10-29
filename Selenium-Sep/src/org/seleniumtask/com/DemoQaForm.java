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

public class DemoQaForm {
	public static void main(String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	
TakesScreenshot ts=(TakesScreenshot)driver;
File scr=ts.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\demo1.png");
FileUtils.copyFile(scr, des);
	
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sridhar");

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("k");

driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("greens@gmail.com");
//Thread.sleep(500);

driver.findElement(By.xpath("//label[.='Male']")).click();

driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567867");

Thread.sleep(3000);
//driver.findElement(By.id("subjectsInput")).sendKeys("Selenium");
Thread.sleep(50);

WebElement monthh = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
monthh.click();

WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
Select s=new Select(month);
Thread.sleep(400);
s.selectByValue("2");

Thread.sleep(1000);
WebElement year = driver.findElement(By.className("react-datepicker__year-select")); 
Select f=new Select(year);
f.selectByValue("2000");

Thread.sleep(300);
WebElement day = driver.findElement(By.xpath("(//div[@role='option'])[25]"));
day.click();
Thread.sleep(3000);

driver.findElement(By.id("subjectsInput")).sendKeys("Selenium");
Thread.sleep(3000);

driver.findElement(By.xpath("//label[.='Sports']")).click();

//Thread.sleep(1000);
//TakesScreenshot ts1=(TakesScreenshot)driver;
//File scr1=ts1.getScreenshotAs(OutputType.FILE);
//File des1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\demo2.png");
//FileUtils.copyFile(scr1, des1);

driver.findElement(By.id("currentAddress")).sendKeys("Thambaram");

Thread.sleep(4000);
driver.findElement(By.id("state")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[.='Haryana']")).click();

Thread.sleep(4000);
driver.findElement(By.id("city")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[.='Karnal']")).click();
Thread.sleep(1000);

Thread.sleep(1000);
TakesScreenshot ts1=(TakesScreenshot)driver;
File scr1=ts1.getScreenshotAs(OutputType.FILE);
File des1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\demo2.png");
FileUtils.copyFile(scr1, des1);

Thread.sleep(100);
driver.findElement(By.id("submit")).click();

 
driver.close();
	}
	

}
