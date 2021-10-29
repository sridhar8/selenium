package org.seleniumpractice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeclz {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
Actions a=new Actions(driver);
Robot b=new Robot();
	
	
WebElement web = driver.findElement(By.xpath("(/html/body/div[2]/div/div/div[2]/div/div/div/div/span/div/div[2])[1]"));
a.moveToElement(web).click().perform();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300);");

WebElement alr= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[3]/span/div/div"));
a.moveToElement(alr).click().perform();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebElement ifr = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[3]/div/ul/li[3]"));
a.moveToElement(ifr).click().perform();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

int siz = driver.findElements(By.tagName("iframe")).size();
System.out.println(siz);

WebElement ifr1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/iframe"));
//*[@id="frame2Wrapper"]//*[@id="frame1"]











	}

}
