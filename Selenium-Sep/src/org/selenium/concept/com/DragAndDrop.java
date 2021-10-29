package org.selenium.concept.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("( //div[@class='header-text'])[5]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000);");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='text'])[28]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement drag = driver.findElement(By.id("draggable"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement drop = driver.findElement(By.id("droppable"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).click().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		
		
		
		
	}

}
