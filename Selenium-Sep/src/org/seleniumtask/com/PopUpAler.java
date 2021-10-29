package org.seleniumtask.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAler {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
//	 driver.manage().window()
	 driver.get("https://demoqa.com/checkbox");
	 
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File scr=ts.getScreenshotAs(OutputType.FILE);
	 File dc=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pop1.png");
	 FileUtils.copyFile(scr, dc);
	 
	 JavascriptExecutor sw=(JavascriptExecutor)driver;
	 sw.executeScript("window.scrollBy(0,1000);");
	 
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@Class='header-text'])[3]")).click();
Thread.sleep(300);
driver.findElement(By.xpath("(//span[.='Alerts'])[1]")).click();
Thread.sleep(300);


driver.findElement(By.id("alertButton")).click();
Thread.sleep(500);
Alert a = driver.switchTo().alert();
Thread.sleep(900);
String s=a.getText();
System.out.println(s);
Thread.sleep(100);

//TakesScreenshot ts1=(TakesScreenshot)driver;
//File scr1=ts1.getScreenshotAs(OutputType.FILE);
//File dc1=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pop2.png");
//FileUtils.copyFile(scr1, dc1);
//
//Thread.sleep(900);
//
//
//
a.accept();


driver.findElement(By.id("timerAlertButton")).click();
Thread.sleep(9000);
Alert b = driver.switchTo().alert();
Thread.sleep(100);
String d=b.getText();
System.out.println(d);
Thread.sleep(500);

//TakesScreenshot ts2=(TakesScreenshot)driver;
//File scr2=ts2.getScreenshotAs(OutputType.FILE);
//File dc2=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pop3.png");
//FileUtils.copyFile(scr2, dc2);
b.accept();

driver.findElement(By.id("confirmButton")).click();
Thread.sleep(90);
Alert c = driver.switchTo().alert();
Thread.sleep(100);
String e=c.getText();
System.out.println(e);
Thread.sleep(500);
//TakesScreenshot ts3=(TakesScreenshot)driver;
//File scr3=ts3.getScreenshotAs(OutputType.FILE);
//File dc3=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\pop4.png");
//FileUtils.copyFile(scr3, dc3);

c.dismiss();

WebElement prompt = driver.findElement(By.id("promtButton"));
prompt.click();
Thread.sleep(90);

Alert f = driver.switchTo().alert();
Thread.sleep(100);
//f.sendKeys("SSSS");
String g=f.getText();
System.out.println(g);
Thread.sleep(5000);
f.accept();




driver.close();
}

}
