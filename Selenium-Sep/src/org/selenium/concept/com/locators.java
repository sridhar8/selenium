package org.selenium.concept.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {		//in fb base xpath mostly is their also see task xpath class and other way of find locators also
	
public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
WebDriver driver=	new ChromeDriver();
		
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");	//while using index based in mathes box we can search index number by using full syntex of index base xpath
	
		
Thread.sleep(1000);
		
WebElement user=driver.findElement(By.xpath("//input[@type='text']"));	//using base xpath
user.sendKeys("greens@gmail.com");

Thread.sleep(1500);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234@Gfss");	//using base xpath 

WebElement text=driver.findElement(By.xpath("//button[@type='submit']"));
String t=text.getText();
System.out.println(t);

TakesScreenshot ts=(TakesScreenshot) driver;
File scr=ts.getScreenshotAs(OutputType.FILE);
File tar=new File("C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Screenshotsconcepts\\fb before.png");
FileUtils.copyFile(scr, tar);



//By.id("attributeValue");
//By.name("attrributeValue");

//Xpath
	//Relative Xpath

//By.xpath("//tagName[@attributeName='attributeValue']);
//By.xpath("(//tagName[@(attributName='attributeValue'])[indexoff]");
//By.xpath("tagName[contains(@attributeName,'attributeValue')][indexoff]");
//By.xpath("//tagName[text()='textValue']");	//instead of text() we can use . but mostly try to use text() for exact finding
//By.xpath("//tagName[.='textValue']");
//By.xpath("//tagName[contains(text(),'textValue']");	//incase text is long we can go for text
	//***********
	
//Helper Functions for xpath
//------------------------------
	//normalize-space() 
//=================================
//e.g By.xpath("//label[normalize-space(@for)='email'] //--- used to avoid the space atfirst and atlast and not inbetween words
//e.g By.text|("//label[normalize-space(text()=''email or phone')] //---used to avoid space atfirst and atlast in text ocontent


	//not()
//====================================
//div[@id='u_0_11']//lable[not(text()='Female')]



//and & or used in xpath
//-------------------------
//By.xpath("//tag[condition1 and condition2 and condition3]---all conditions should be true
//By.xpath("//tag[condition1 or condition2 or condition3]----atleast 1 condition should be true
//By.xpath("//tagName[@AttributeName='AttributeValue' and AttributeName='AttributeValue'] //--->all the conditions should be true
//e.g(tagName[@for='email' and text()='email or phone']
//By.xpath("//tagName[@AttributeName='AttributeValue' or AttrinbuteName='AttributeValue'] //-->atleast one condition should be true
//e.g(tagName[@for='email' or text()='email or phone']





//**********************************************
//absolute Xpath
//by.xpath("/html/body/div/div/div[2]/div");-->like that..it came from the html tag and find the relation (parent,siblings like that)upto the elemnt where we work
	//***************************************

//By.tagName("tagName");//mostlu used in iframe to find total number of frames(size)
//By.linkText("textValue");		//can be used only for a tag text
//By.partialLinkText("textValue");	//can be used only for a tag text and text is toolong we can go for partialLinkedText 
Thread.sleep(500);
driver.navigate().refresh();
driver.navigate().back();
Thread.sleep(200);
driver.close();

}
	

}

