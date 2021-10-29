package org.seleniumtask.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Phs2 {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Actions a =new Actions(driver);
	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	a.moveToElement(login).click().perform();
	Thread.sleep(1000);
	
	JavascriptExecutor sw=(JavascriptExecutor)driver;
	 sw.executeScript("window.scrollBy(0,1000);");
	
	 WebElement mail = driver.findElement(By.id("email"));
	 Thread.sleep(1000);
	a.moveToElement(mail).click().sendKeys("greens@gmail.com").perform();
	Thread.sleep(100);
	WebElement pass = driver.findElement(By.id("passwd"));
	a.moveToElement(pass).click().sendKeys("Ashur@12345").build().perform();
	Thread.sleep(100);
	WebElement log = driver.findElement(By.id("SubmitLogin"));
	a.moveToElement(log).click().perform();
	Thread.sleep(1000);
	WebElement women = driver.findElement(By.xpath("//a[.='Women']"));
	a.moveToElement(women).perform();
	Thread.sleep(100);
	WebElement drs = driver.findElement(By.xpath("//a[.='Evening Dresses']"));
	a.moveToElement(drs).click().perform();
	Thread.sleep(5000);
	
	JavascriptExecutor sw1=(JavascriptExecutor)driver;
	 sw1.executeScript("window.scrollBy(0,500);");
	
	 WebElement img = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	a.moveToElement(img).click().perform();
	Thread.sleep(3000);
	
	int siz = driver.findElements(By.tagName("iframe")).size();
	System.out.println(siz);
	
	
	WebElement iff = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(iff);//iframe by frame(args)
//	driver.switchTo().frame(0);	//iframe by index number....here only 1 frame is their. so 0 is frame index number -1 method size
//	driver.switchTo().frame("");//iframe by id or name..here name and id are alpha numberric so we go with 3rd mehtod or 1st method
	WebElement icon = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//	WebElement icon = driver.findElement(By.xpath("//a[@data-field-qty='qty'][2]"));
	icon.click();
	icon.click();
	icon.click();
//	icon.sendKeys("3");
	Thread.sleep(1000);
	
	WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
	a.moveToElement(size).click().perform();
	Select m= new Select(size);
	m.selectByValue("2");
	Thread.sleep(1000);
	
	WebElement clr = driver.findElement(By.xpath("//a[@name='Pink']"));
	a.moveToElement(clr).click().perform();
	Thread.sleep(1000);
	
	WebElement sub = driver.findElement(By.name("Submit"));
	a.moveToElement(sub).click().perform();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	WebElement pc = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	a.moveToElement(pc).click().perform();
	
	Thread.sleep(1000);
	JavascriptExecutor sw2=(JavascriptExecutor)driver;
	 sw2.executeScript("window.scrollBy(0,300);");
	
	 Thread.sleep(1000);
	 
	TakesScreenshot ts=(TakesScreenshot)driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\ph.png");
	FileUtils.copyFile(scr, des);
	
	Thread.sleep(4000);
	
//	driver.switchTo().defaultContent();
	WebElement f = driver.findElement(By.xpath(("(//a[@title='Proceed to checkout'])[2]")));
	a.moveToElement(f).click().perform();
	Thread.sleep(2000);
	
	JavascriptExecutor sw3=(JavascriptExecutor)driver;
	sw3.executeScript("window.scrollBy(0, 700);");
	
	Thread.sleep(3000);
	driver.findElement(By.name("message")).sendKeys("Hi");
	Thread.sleep(4000);
	
	
	Thread.sleep(1000);
	TakesScreenshot ts2=(TakesScreenshot)driver;
	File scr2 = ts2.getScreenshotAs(OutputType.FILE);
	File des2=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\ph2.png");
	FileUtils.copyFile(scr2, des2);
	
	WebElement ff = driver.findElement(By.name("processAddress"));
	a.moveToElement(ff).click().perform();
	Thread.sleep(500);
	
	JavascriptExecutor sw4=(JavascriptExecutor)driver;
	sw4.executeScript("window.scrollBy(0, 800);");
	
	driver.findElement(By.id("uniform-cgv")).click();
	
	Thread.sleep(1000);
	WebElement fff = driver.findElement(By.name("processCarrier"));
	a.moveToElement(fff).click().perform();
	
	JavascriptExecutor sw5=(JavascriptExecutor)driver;
	sw5.executeScript("window.scrollBy(0, 300);");
	
	
	Thread.sleep(1000);
	TakesScreenshot ts3=(TakesScreenshot)driver;
	File scr3 = ts2.getScreenshotAs(OutputType.FILE);
	File des3=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\ph3.png");
	FileUtils.copyFile(scr3, des3);
	
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	
	}

}
