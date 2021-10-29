package org.selenium.concept.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);-->Mostly we used
public class ScreenShotandTimeDelay {
	public static void main(String[] args) throws Throwable    {	//tried all ways of throws it print the output but have to know why throwable only
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("greens@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	
	Thread.sleep(2000);		//we throw the thread to delay the process over the time which is mentioned in that bracket milliesecs
							//so throws command added in main method 
	
	TakesScreenshot ts=(TakesScreenshot) driver;	//narrowsing(high into small)--> type casting has been used 
	
	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);	//take screenshot on webpage is saved in file type
	 							//why because file type can be accessed where ever u want in selenium 
	 							//file methods can be stored in file class
	
	 //taken screen shots can be stored seperate folder
//	 for that we have to create a new folder in that project
//	 below line mentioned how to save that screen shot from file into png
	 File toSave= new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshots\\fb.date7.png");//path of the folder
	 
	 FileUtils.copyFile(screenshotAs, toSave);	//copy screenshot from ....to....
	 
	 
	WebElement login = driver.findElement(By.name("login"));
	login.click(); //or click();
	
	Thread.sleep(2000);
	TakesScreenshot ts1=(TakesScreenshot) driver;
	File screenshotAs2 = ts1.getScreenshotAs(OutputType.FILE);
	File afterlogin=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshots\\fb.png");
	FileUtils.copyFile(screenshotAs2, afterlogin);
	
	driver.close();
	}

}
