package org.seleniumtask.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
//	Interface				class
	WebDriver driver= new ChromeDriver();					//upcasting
	driver.get("https://demoqa.com/frames");						
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
int s = driver.findElements(By.tagName("iframe")).size();	
System.out.println(s);
WebElement f = driver.findElement(By.xpath("//iframe[@id='frame1']"));
driver.switchTo().frame(0);

String t = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
System.out.println(t);

}
}
