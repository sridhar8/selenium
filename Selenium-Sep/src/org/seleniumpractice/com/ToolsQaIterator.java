package org.seleniumpractice.com;
//new window switch
//list iterate
//y reverse la titles print
//
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;

import okio.Timeout;

public class ToolsQaIterator
{
	
	private static Iterator<String> iterator;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	Thread.sleep(300);
	JavascriptExecutor sd=(JavascriptExecutor)driver;
	sd.executeScript("window.scrollBy(0,1000);");
	
	Actions a =new Actions(driver);
	Thread.sleep(200);
	WebElement title = driver.findElement(By.xpath("//div[.='Alerts, Frame & Windows']"));
	a.click(title).perform();
	Thread.sleep(100);
	
	WebElement sT = driver.findElement(By.xpath("//span[.='Browser Windows']"));
	a.click(sT).perform();
	Thread.sleep(1000);
	
	WebElement nT = driver.findElement(By.id("tabButton"));
	a.click(nT).perform();
	Thread.sleep(1000);
	
	String mainpage = driver.getTitle();
	System.out.println(mainpage);
	
	
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println("************");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 Iterator<String> it = windowHandles.iterator();
	 String first = it.next();
	 String second = it.next();
	 
	 String title2 = driver.switchTo().window(second).getTitle();
	 System.out.println(title2);

TakesScreenshot ts=(TakesScreenshot)driver;
File scr = ts.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\sam.png");
FileUtils.copyFile(scr, des);

WebElement text = driver.findElement(By.id("sampleHeading"));
a.moveToElement(text).click().perform();
boolean selected = text.isSelected();
System.out.println(selected);
String t = text.getText();
System.out.println(t);
boolean displayed = text.isDisplayed();
System.out.println(displayed);

driver.switchTo().window(first);
	 
WebElement nW = driver.findElement(By.id("windowButton"));
a.moveToElement(nW).click().perform();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//Set<String> windowHandles2 = driver.getWindowHandles();
//for (String string : windowHandles2) {
//	String tH2 = driver.switchTo().window(string).getTitle();
//	System.out.println(tH2);
////	
//}


	}

}
