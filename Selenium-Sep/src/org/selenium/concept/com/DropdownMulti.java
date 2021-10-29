package org.selenium.concept.com;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMulti {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	WebElement multichoice=driver.findElement(By.id("multi-select"));	//WebElement for total selection box
	Select s=new Select(multichoice);									//constructor concept multi chooice  been stored in select class
	Boolean k=s.isMultiple();
	List<WebElement>l=s.getOptions();									//stored webwlements in list which are all in choice box thats why <WebElements>
	int a=l.size();
	System.out.println(a);

//directly print particular text from the list	
	System.out.println("*********************************");
	System.out.println(l.get(3).getText());
	System.out.println(l.get(5).getText());

System.out.println("********************************************");

//by using for loop print whole text
	for (int i = 0; i <a; i++) {
		String b=l.get(i).getText();
		System.out.println(b);
	}
	System.out.println("*********************************");

//bu using for loop for print particular text
	for (int i = 0; i < l.size(); i++) {
		if(i==2||i==4) {
			System.out.println(l.get(i).getText());
		}
		
		
	}
	System.out.println("*********************************");

//by using enhanced for loop print whole text
	for (WebElement webElement : l) {
		String c=webElement.getText();
		System.out.println(c);
		
	}
	System.out.println("***********************************************");

//by using listIterator print all text
	ListIterator<WebElement> listIterator = l.listIterator();
	while(listIterator.hasNext()) {
	String d=listIterator.next().getText();
	System.out.println(d);
	}
	System.out.println("********************************************");
	
	
	
	driver.close();
	}
}
