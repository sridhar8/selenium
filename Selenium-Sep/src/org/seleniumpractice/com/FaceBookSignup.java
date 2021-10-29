package org.seleniumpractice.com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBookSignup {
	
	private static boolean enabled;
	private static boolean selected;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q=fb+login&oq=fb&aqs=chrome.1.69i59l2j0i271.1787j0j4&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[5]/a")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("sridhark");
	boolean sele = firstname.isSelected();
	System.out.println(sele);
	boolean displayed = firstname.isDisplayed();
	System.out.println(displayed);
	boolean enable = firstname.isEnabled();
	System.out.println(enable);
	
	driver.findElement(By.name("lastname")).sendKeys("k");
	driver.findElement(By.name("reg_email__")).sendKeys("8190983883");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("reg_passwd__")).sendKeys("8190sridhar");
	WebElement date = driver.findElement(By.id("day"));
	Select day =new Select(date);
	day.selectByValue("2");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement month = driver.findElement(By.id("month"));
	Select mon=new Select(month);
	mon.selectByValue("2");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement yr = driver.findElement(By.id("year"));
	Select year=new Select(yr);
	year.selectByValue("1991");
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	WebElement gen = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	gen.click();
	boolean sel = gen.isSelected();
	System.out.println(sel);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("websubmit")).click();
//	driver.close();
	


			
		}
		
	}
	
	


	
	
