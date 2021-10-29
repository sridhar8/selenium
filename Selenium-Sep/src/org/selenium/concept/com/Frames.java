package org.selenium.concept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
//	Interface				class
	WebDriver driver= new ChromeDriver();					//upcasting
	driver.get("Url of the test page");						
	driver.manage().window().maximize();					
Actions a=new Actions(driver);								
	
driver.switchTo().frame(0);//-index 
driver.switchTo().frame("null");//id and name 


WebElement sample=driver.findElement(By.xpath("webElement"));	
driver.switchTo().frame(sample);//webElement				
driver.switchTo().parentFrame();//return to parent page							
	driver.switchTo().defaultContent();//return to main scr page														
															

}}
//iframe is updated version of frame
//iframe is the example of method overloading in selenium
//initially identity the number of frames in that page
	//then find the iframe weather it is nested iframe or individual iframe
//iframe can be located by 3ways
//1--is by means of index number--started with index of 0
	//if only one frame is their mean we can use 0 which mean -1method
//2--is by means of id or name--no alpha numeric
//3--is by means of webElement--identify WebElement then call into arguments 
//driver.switchTo.frame()---enter into iframe
//driver.switchTo.default()---return to main page source
//driver.switchTo.Parent()----return to parent page source
//also see Phs2 in task


