package org.selenium.concept.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouKeyActions {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");//browser launchand environment setup
		//interface ref.name	//class
		WebDriver driver = new ChromeDriver();	//upcasting
		
driver.manage().window().maximize();				//Actions is a class and action is a interface
driver.get("https://www.amazon.in/");				//to perform any action on the web application such as double click,dragand drop we need action class

Actions a = new Actions(driver);	

WebElement pick = driver.findElement(By.xpath("//a[.='Mobiles']"));	//Actions is a class providing handling keyboard and mouse events
Thread.sleep(2000);
a.moveToElement(pick);
a.click().build().perform();//click() or click and hold					//initially we used build() method to build the structure for perform later versions perform is enough 
	//(OR)
//a.moveToElement(pick).click().perform();		//mouse based events-->Click and hold(),contextClick(),doubleClick(),drag and drop(scr,des),moveToElement()
Thread.sleep(2000);

WebElement pick1 = driver.findElement(By.xpath("//a[.='Best Sellers']"));
a.moveToElement(pick1);
Thread.sleep(3000);
a.contextClick().perform(); //context click() i.e right click()		
							//after that right click we go for a keyboard(Robot) events--->VK_UP(),VK_DOWN,VK_ENTER etc we can perform all keys event which are all available in key board
Thread.sleep(4000);
Robot ka=new Robot();		//VK are useds to perforn the key board events some example are listed below
							
ka.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);	
ka.keyPress(KeyEvent.VK_ENTER);
ka.keyRelease(KeyEvent.VK_DOWN);

//drag and drop
//WebElement drag=driver.findElement(Locator for drag content);
//WebElement drop=driver.findElement(locator for drop box);
//a.dragAndDrop(drag, drop);

//double click
//WebElement dubcl=driver.findElement(locator for doubleclick content);
//a.doubleClick(dubcl);
	}

}
