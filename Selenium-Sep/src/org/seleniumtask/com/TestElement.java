package org.seleniumtask.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/accounts/login/");
	
//	WebElement user = driver.findElement(By.name("username"));
//	WebElement user = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
//boolean b = user.isSelected();
//System.out.println(b);
//	String dname = user.getAttribute("placeholder");
//	System.out.println(dname);
//	user.sendKeys("greens@gmail");
	
	WebElement password = driver.findElement(By.name("password"));
	
//	WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
	password.sendKeys("1234");
	
//	user.submit();
	
	
	}

}
