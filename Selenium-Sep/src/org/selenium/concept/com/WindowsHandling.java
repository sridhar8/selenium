package org.selenium.concept.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
//windows handling in the sense-
//we can switch from one tab to another tab(or)new window accessing and multiple window handlings
//current window closing and other than current window closings and windows related work
public static void main(String[] args) throws InterruptedException, AWTException {
				//webdriver.chrome.driver, driver path
System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
//interface			//class
WebDriver driver=new ChromeDriver();//upcasting
driver.manage().window().maximize();
driver.get("https://www.whatsapp.com/");
Thread.sleep(3000);

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
WebElement Element2 = driver.findElement(By.xpath("//a[@class='_9rne _9vcv']//h5[text()='HELP CENTER']"));
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

String title = driver.getTitle();	//here many tabs are opened but according to selenium its still in mainpage so normally print title meant it print main page title
System.out.println("title of the main window/ "+title);
System.out.println("******1*************");

int size = driver.getWindowHandles().size();
System.out.println(size);
System.out.println("******2*************");

Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);
for (String windowsAll : windowHandles) {
	System.out.println(windowsAll);
String allTitle = driver.switchTo().window(windowsAll).getTitle();	//print all the titles by using for each 
System.out.println(allTitle);
} 
System.out.println("*****3***********");

String one="WhatsApp";
String two="WhatsApp Security";
String three="WhatsApp Help Center";
String four="WhatsApp Features";

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

for (String string : windowHandles) {		//switching the window/tab use break keyword for switch see line 124 to 126
	if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(two)) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		System.out.println(driver.getTitle());
}
}
System.out.println("*****4***********");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

for (String string1 : windowHandles) {				//closing of windows /tabs
	if (!driver.switchTo().window(string1).getTitle().equalsIgnoreCase(two) && 
		!driver.switchTo().window(string1).getTitle().equalsIgnoreCase(four)) {//we can use logical operators to close other tabs
//System.out.println(driver.getTitle()); 
Thread.sleep(4000); 
driver.close(); 
}
}

System.out.println("*********5******************");
String title2 = driver.getTitle();
System.out.println(title2);
System.out.println(driver.getCurrentUrl());

WebElement text = driver.findElement(By.xpath("//h5[text()='WHATSAPP WEB']"));
System.out.println(text.getText());

  Set<String> WH = driver.getWindowHandles(); 	//once closed the window /tab
  												//then again we can create from the starting
  System.out.println(driver.getWindowHandles().size()); System.out.println(WH);
  for (String al : WH) {
  
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  System.out.println(driver.switchTo().window(al).getTitle());
  
  }
  
  System.out.println(":****6******"); String onee="WhatsApp Security"; String
  twoo="WhatsApp Features"; driver.manage().timeouts().implicitlyWait(5,
  TimeUnit.SECONDS);
  
  for (String string : WH) { if (!twoo.equalsIgnoreCase(string)) {
  driver.switchTo().window(string).getTitle().equalsIgnoreCase(onee); 
  break;//--------------important
  
  }

}	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	

System.out.println(":****7******");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
//System.out.println(driver.getCurrentUrl());


System.out.println("**********");
driver.close();
driver.quit();
}}











//instead of iterator we can use for each to switch the window or tab
//initially we can get the title of all the tabs/windows which are all opened by using for each
//then store the window/tob title in string from the console 
//then call in where we hve to switch the tab or window
//if (driver.switchTo().window(for each reference name).getTitle().equals(string reference)) {
//	System.out.println("done");
//	
//}
	
//Iterator<String> iter = windowHandles.iterator();			//iterator used to store the window reference it used to call the window where we have to switch
//String first = iter.next(); 
//String second = iter.next();
//String third = iter.next();
//String fourth = iter.next();
//
//String trd = driver.switchTo().window(third).getTitle();
//System.out.println("trd titleis "+trd);			



