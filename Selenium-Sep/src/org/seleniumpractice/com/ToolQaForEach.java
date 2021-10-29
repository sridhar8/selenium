package org.seleniumpractice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolQaForEach {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=	new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	Actions a =new Actions(driver);
	Robot b=new Robot();
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
	
	String title2 = driver.getTitle();
	String Url1 = driver.getCurrentUrl();
	System.out.println(title2);
	System.out.println(Url1);
	String mainurl="https://demoqa.com/browser-windows";
	String main="ToolsQA";
String parent = driver.getWindowHandle();
System.out.println(parent);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();
		System.out.println("Title: "+title);
	}
	WebElement newTab = driver.findElement(By.id("sampleHeading"));
	String text = newTab.getText();
	System.out.println(text);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	for (String string : windowHandles) {
//		if (condition) {
			
//		}
		
	}
	
//	
//WebElement optionElement2 = driver.findElement(By.id("windowButton"));
//a.moveToElement(optionElement2).click().perform();	
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//Set<String> childs = driver.getWindowHandles();
//System.out.println(driver.getWindowHandles());
//System.out.println(driver.getWindowHandles().size());
//
//for (String string : childs) {
//	if (!parent.equalsIgnoreCase(string)) {
//driver.switchTo().window(string);
//	}
//	
//}
//
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//WebElement newWindow = driver.findElement(By.id("sampleHeading"));
//System.out.println(driver.getTitle());
//String text2 = newWindow.getText();
//System.out.println(text2);
//driver.switchTo().window(parent).close();

//Set<String> windowHandles2 = driver.getWindowHandles();
//for (String string1 : windowHandles2) {
//String title1 = driver.switchTo().window(string1).getTitle();
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//System.out.println(title1);
}


	
//	driver.close();
	

