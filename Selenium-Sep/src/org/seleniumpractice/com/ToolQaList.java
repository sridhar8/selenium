package org.seleniumpractice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolQaList {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=	new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	Actions a =new Actions(driver);
	Robot b=new Robot();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement Element1 = driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
	a.moveToElement(Element1).click().perform();
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("window.scrollBy(0,100);");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement Element3 = driver.findElement(By.xpath("(//div[@class='header-text'])[3]"));
	a.moveToElement(Element3).click().perform();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement inElement1 = driver.findElement(By.xpath("(//span[@class='text'])[11]"));
	a.moveToElement(inElement1).click().perform();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement optionElement1 = driver.findElement(By.id("tabButton"));
	a.moveToElement(optionElement1).click().perform();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	String tab1 = driver.getWindowHandle();
	System.out.println(tab1);
	String title1 = driver.getTitle();
	String Url1 = driver.getCurrentUrl();
	System.out.println(title1);
	System.out.println(Url1);
	int size = driver.getWindowHandles().size();
	System.out.println(size);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String>windows=new ArrayList<String>(windowHandles);
	WebDriver tab2 = driver.switchTo().window(windows.get(1));
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(windows.get(0));
	WebElement optionElement2 = driver.findElement(By.id("windowButton"));
	a.moveToElement(optionElement2).click().perform();
	
	
	
//	driver.close();
//	System.out.println(driver.getCurrentUrl());--->still in closed tab2
}
}