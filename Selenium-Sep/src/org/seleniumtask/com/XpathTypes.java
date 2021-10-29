package org.seleniumtask.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class XpathTypes {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("greens@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@asAD");
		
		WebElement text=driver.findElement(By.xpath("//button[@type='submit']"));
		String t=text.getText();
		System.out.println(t);
		
//		driver.navigate().back();		//wrong line back and refresh cant operate at very next
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		WebElement signup=driver.findElement(By.xpath("//span[.='Sign up']"));	//xpth text base
		signup.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File d=		new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\inst.png");
		FileUtils.copyFile(f, d);
		
//		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("greens@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='fullName'])")).sendKeys("Sridhar");
		Thread.sleep(300);
//		driver.findElement(By.xpath("(//input[@type='text'])[26])")).sendKeys("sridhark");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sri");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("1234Aser");
		Thread.sleep(1000);
		
	WebElement txt=	driver.findElement(By.xpath("//a[.='Log in']"));	//xpath text base
	Thread.sleep(1000);
	String tx=txt.getText();
	System.out.println(tx);
	Thread.sleep(200);
	
//	WebElement defaults=driver.findElement(By.xpath("//p[.='By signing up, you agree to our ]"));
//	String q=defaults.getAttribute("placeholder");
//	System.out.println(q);
	
	Thread.sleep(200);
	TakesScreenshot ts1=(TakesScreenshot)driver;
	File e=ts1.getScreenshotAs(OutputType.FILE);
	File g=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotstask\\intalst.png");
	FileUtils.copyFile(e,g);
	
	
	driver.close();

	}

}
