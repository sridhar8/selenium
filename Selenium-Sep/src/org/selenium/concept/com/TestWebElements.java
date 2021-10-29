package org.selenium.concept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://m.facebook.com/login/?refsrc=deprecated");
	
//	(locators are used to inspect or choose the particular elements for operation)
//	(totally 8 locators are used to find or choose the exact elements)
//	(those are id,name,class name,x path, tag name,css selector,link text,partial linktest)-->incxtclp
//	in that most commonly used one is id,name,class(in that three id is the familiar)
//	while we choose locators make sure numbers are not their in the scripts
	
//	WebElement user = driver.findElement(By.id("m_login_email"));	//id locator used
//	System.out.println(user);
	
	WebElement user = driver.findElement(By.name("email"));			//name locator used
	
	String defaultName = user.getAttribute("placeholder");		//used to print default name if any thing is their in that real broewser element
	System.out.println(defaultName);
	
	user.sendKeys("greens@gmail.com");						//sendkeys are used to enter the value in that page for test reasons
	
//	String defalutPassword = user.getAttribute("value");
//	System.out.println(defalutPassword);
	
	WebElement password = driver.findElement(By.id("m_login_password"));//id locator used for password
	
//	WebElement password = password.findElement(By.name("pass"));// name locator used for password
//	System.out.println(password);
	password.sendKeys("1234");
	
	boolean displayed = user.isDisplayed();		//isDisplayed method used for check user value whether it is display or not 
	System.out.println(displayed);
	
	boolean displayed2 = password.isDisplayed();
	System.out.println(displayed2);
	
//	String attribute = user.getAttribute(defaultName);
//	System.out.println(attribute);
	
//	String attribute2 = password.getAttribute(defalutPassword);
//	System.out.println(attribute2);
	
	WebElement login = driver.findElement(By.name("login"));	//name locator used for login and click mathod
	
	login.click();
	
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.close();
	
	}

}
