package org.seleniumpractice.com;

import org.openqa.selenium.By;							//*doubts
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiabuttons {
	public static void main(String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("sridhar");
		Thread.sleep(200);
		
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		Thread.sleep(100);
		
		driver.findElement(By.id("userEmail")).sendKeys("greens@gmail.com");
		Thread.sleep(50);
		
		WebElement gender=driver.findElement(By.xpath("//label[.='Male']"));
		Thread.sleep(2000);
//*		boolean selected = gender.isSelected();
//*		System.out.println(selected);
//*		gender.click();
//*		gender.click();
//*		boolean selected2 = gender.isSelected();
//*		System.out.println(selected2);
		Thread.sleep(200);
//*		driver.findElement(By.xpath("(//input[@type='text'])[50]")).sendKeys("8290983884");
		driver.findElement(By.id("userNumber")).sendKeys("8190984884");
		Thread.sleep(1000);
		driver.close();
		
	}

}
