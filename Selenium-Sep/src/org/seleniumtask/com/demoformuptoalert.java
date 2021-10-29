package org.seleniumtask.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoformuptoalert {

	public static void main(String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);

		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\demo1.png");
		FileUtils.copyFile(scr, ds);
		Thread.sleep(100);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sridhar");
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("k");
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ramapuram");
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("greens@gmail.com");
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8190983883");
		Thread.sleep(50);
//		WebElement gender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
//		gender.click();
		
		driver.findElement(By.xpath("//label[text()=' Male ']")).click();
//		gender.click();
		
		Thread.sleep(50);
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		Thread.sleep(100);
		
		WebElement lgn = driver.findElement(By.id("msdd"));
//		lgn.click();
		Thread.sleep(30);
		lgn.click();
		
		driver.findElement(By.xpath("//a[.='English']")).click();
		Thread.sleep(50);
		
		WebElement lng = driver.findElement(By.xpath("//a[.='Dutch']"));
		lng.click();
		Thread.sleep(30);
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select da=new Select(day);
		da.selectByValue("4");
		Thread.sleep(40);
		
		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select mo=new Select(month);
		mo.selectByValue("April");
		Thread.sleep(300);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select yr=new Select(year);
		yr.selectByValue("2000");
		Thread.sleep(300);
		
		WebElement skill = driver.findElement(By.id("Skills"));
		Select sk=new Select(skill);
		sk.selectByValue("Adobe InDesign");
		Thread.sleep(300);
		
		WebElement cntry = driver.findElement(By.id("countries"));
		Select cn=new Select(cntry);
		cn.selectByVisibleText("Select Country");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		WebElement con = driver.findElement(By.xpath("//li[.='Denmark']"));
		con.click();
		Thread.sleep(50);
		
		driver.findElement(By.id("firstpassword")).sendKeys("eiq123Sd");
		Thread.sleep(300);
		
		driver.findElement(By.id("secondpassword")).sendKeys("eiq123Sd");
		Thread.sleep(300);
		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(300);
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File scr1=ts1.getScreenshotAs(OutputType.FILE);
		File ds1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\demo.png");
		FileUtils.copyFile(scr1, ds1);
		
		driver.close();
//		driver.findElement(By.id("Skills")).click();
	}


}
