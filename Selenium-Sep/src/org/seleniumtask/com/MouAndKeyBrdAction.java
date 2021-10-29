package org.seleniumtask.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouAndKeyBrdAction {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		
//interface				//class		
WebDriver driver=new ChromeDriver();		//upcasting
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

Thread.sleep(1000);
TakesScreenshot ts=(TakesScreenshot)driver;
File scr = ts.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\aa.png");
FileUtils.copyFile(scr, des);

Thread.sleep(2000);
Actions a = new Actions(driver);
WebElement pick = driver.findElement(By.xpath("//a[.='Mobiles']"));
Thread.sleep(1000);
a.moveToElement(pick).build().perform();
a.click().perform();
Thread.sleep(3000);

WebElement pick1 = driver.findElement(By.xpath("//a[.='Best Sellers']"));
a.moveToElement(pick1);
Thread.sleep(3000);
a.contextClick().perform();
Thread.sleep(4000);
Robot nt=new Robot();
nt.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
nt.keyPress(KeyEvent.VK_ENTER);
nt.keyRelease(KeyEvent.VK_DOWN);

WebElement pick2 = driver.findElement(By.xpath("//a[.='Fashion']"));
Thread.sleep(1000);
a.moveToElement(pick2);
a.contextClick().perform();
Thread.sleep(500);
nt.keyPress(KeyEvent.VK_DOWN);
nt.keyPress(KeyEvent.VK_ENTER);
nt.keyRelease(KeyEvent.VK_DOWN);

WebElement pick3 = driver.findElement(By.xpath("//a[.='Customer Service']"));
a.moveToElement(pick3).contextClick().perform();
Thread.sleep(1000);
nt.keyPress(KeyEvent.VK_DOWN);
nt.keyPress(KeyEvent.VK_ENTER);
nt.keyRelease(KeyEvent.VK_DOWN);

TakesScreenshot ts1=(TakesScreenshot)driver;
File scr1 = ts1.getScreenshotAs(OutputType.FILE);
File des1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\a.png");
FileUtils.copyFile(scr1, des1);
driver.close();
	
	
	
	}
	

}
