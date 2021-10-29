package org.selenium.concept.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String []args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");//browser launch environment setup
	WebDriver driver=	new ChromeDriver();		//upcasting
	
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");//popup or alerts are displays on the screen to give the user need info or notify.
	
	 JavascriptExecutor sw=(JavascriptExecutor)driver;//Scroll down excecutable
	 sw.executeScript("window.scrollBy(0,1000);");
	 Thread.sleep(1000);
	
//	driver.findElement(By.className("btn btn-default")).click();
	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();	//alert is an not inspectable one so we cant call dom structure to work on it 
	Thread.sleep(1000);
//	simple.click();									
	Alert a=driver.switchTo().alert();			//for working on alert dialog box we can call alert methods
	a.accept();									//Alert methods are accept(),dismiss(),sendKeys(),getText()
	
	Thread.sleep(1000);
//	driver.findElement(By.className("btn btn-default btn-lg")).click();
	driver.findElement(By.xpath("//button[.='Click me!']")).click();
	Thread.sleep(1000);
	Alert b= driver.switchTo().alert();			//generally 3 types of alerts are there
	b.dismiss();								//simple alert- in simple alert we can need to accept the alert box by var.accept
	
	WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	prompt.click();								//confirm alert- we have a option either choose ok or cancel in that alert box
	Thread.sleep(3000);							//prompt alert- we have to enter some details in the prompt box of the alert box then we can choose either one
//	prompt.sendKeys("Sridhar:");				//screen shot not work if alert popup displays
	Alert c=driver.switchTo().alert();			//sendKeys will chaick
	
	c.sendKeys("SRIDHAR");
	Thread.sleep(4000);
	String text = c.getText();
	System.out.println(text);
	
	c.accept();
	driver.close();

	}

}
