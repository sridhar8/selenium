package org.seleniumpractice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowsSetList {
public static void main(String[] args) throws AWTException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.whatsapp.com/");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Actions a=new Actions(driver);
	Robot kb=new Robot();
	WebElement Element1 = driver.findElement(By.xpath("//a[@class='_9rne _9vcv']//h5[text()='FEATURES']"));
	a.contextClick(Element1).perform();
	kb.keyPress(KeyEvent.VK_DOWN);
	kb.keyRelease(KeyEvent.VK_DOWN);
	kb.keyPress(KeyEvent.VK_ENTER);
	kb.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement Element2 = driver.findElement(By.xpath("//a[@class='_9rne _9vcv']//h5[text()='DOWNLOAD']"));
	a.contextClick(Element2).perform();
	kb.keyPress(KeyEvent.VK_DOWN);
	kb.keyRelease(KeyEvent.VK_DOWN);
	kb.keyPress(KeyEvent.VK_ENTER);
	kb.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement Element3 = driver.findElement(By.xpath("//a[@class='_9rne _9vcv']//h5[text()='SECURITY']"));
	a.contextClick(Element3).perform();
	kb.keyPress(KeyEvent.VK_DOWN);
	kb.keyRelease(KeyEvent.VK_DOWN);
	kb.keyPress(KeyEvent.VK_ENTER);
	kb.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	String window1 = driver.getWindowHandle();
	System.out.println(window1);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getWindowHandles().size());
	
	Set<String> windows = driver.getWindowHandles();
	List<String> list=new ArrayList<String>(windows);
	System.out.println(windows);
	System.out.println(list);
	System.out.println(driver.switchTo().window(list.get(0)).getTitle());
	System.out.println(driver.switchTo().window(list.get(1)).getTitle());
	System.out.println(driver.switchTo().window(list.get(2)).getTitle());
	System.out.println(driver.switchTo().window(list.get(3)).getTitle());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.switchTo().window(list.get(2)).getTitle());
	driver.close();
	System.out.println(driver.switchTo().window(list.get(3)).getTitle());//====>this window has been closed in preivous line.
//	System.out.println(driver.switchTo().window(list.get(2)).getTitle());
	
//	so when we closed the current window,selenium browser can't move to some other window automatically
//	so we have to switch from some other window by script
//	for that we can use line 70.but tab/window index number 2 is reserved for that closed tab/window.line 71 explains
//	so in future avoiding confusions we clear the existing list and created new one
//	for that again we call Set<String> ref.name=driver.getWindowHandles();
//	then clear all the values before stored in list and 
//	again call the values of set in list then widows can be switches for an action as follows
	 Set<String> windows2 = driver.getWindowHandles();
	 list.clear();
	 list.addAll(windows2);
	 System.out.println(driver.switchTo().window(list.get(0)).getTitle());
	driver.close();
	driver.quit();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	
	
}
}
