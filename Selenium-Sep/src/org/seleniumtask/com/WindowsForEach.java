package org.seleniumtask.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsForEach {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/search?q=simple&hl=en&sxsrf=AOaemvK07mlPrwupmYXD_vJek_QIQERmnw%3A1633096306115&source=hp&ei=chJXYcSdBM_R-QbIoa2gDA&iflsig=ALs-wAMAAAAAYVcggk3YFcZgnd57cHRB11H8acoARb0b&ved=0ahUKEwjEntTpranzAhXPaN4KHchQC8QQ4dUDCAg&uact=5&oq=simple&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAEIAEELEDMggIABCABBCxAzIFCAAQgAQyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyDgguEIAEELEDEMcBEK8BMggIABCABBCxAzIICAAQgAQQsQMyBQgAEIAEOgcIIxDqAhAnOgQIIxAnOgUIABCRAjoICC4QsQMQgwE6CwgAEIAEELEDEIMBOhEILhCABBCxAxCDARDHARDRAzoICAAQsQMQgwE6CAguEIAEELEDOgUILhCABDoLCC4QgAQQsQMQkwI6DgguEIAEELEDEMcBEKMCUJssWN9IYIRRaAFwAHgAgAHGAYgB8geSAQMwLjaYAQCgAQGwAQo&sclient=gws-wiz");

Thread.sleep(3000);
	Actions a =new Actions(driver);

WebElement hair = driver.findElement(By.xpath("//span[text()='hairstyle']"));
Thread.sleep(500);
a.moveToElement(hair).contextClick().perform();
Thread.sleep(200);
	Robot kb=new Robot();
kb.keyPress(KeyEvent.VK_DOWN);
kb.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(400);
kb.keyPress(KeyEvent.VK_ENTER);
kb.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

WebElement ran = driver.findElement(By.xpath("//span[text()='rangoli']"));
a.moveToElement(ran).contextClick().perform();
kb.keyPress(KeyEvent.VK_DOWN);
kb.keyRelease(KeyEvent.VK_DOWN);
kb.keyPress(KeyEvent.VK_ENTER);
kb.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

WebElement mak = driver.findElement(By.xpath("//span[text()='makeup']"));
a.moveToElement(mak).contextClick().perform();
kb.keyPress(KeyEvent.VK_DOWN);
kb.keyRelease(KeyEvent.VK_DOWN);
kb.keyPress(KeyEvent.VK_ENTER);
kb.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

String title = driver.getTitle();
System.out.println("title of the main window/ "+title);

Thread.sleep(1000);

WebElement linkText = driver.findElement(By.linkText("Face moisturisers and creams"));
a.moveToElement(linkText).click().perform();

int size = driver.getWindowHandles().size();
System.out.println(size);

Set<String> windowHandles = driver.getWindowHandles();
for (String string : windowHandles) {
	String al = driver.switchTo().window(string).getTitle();
System.out.println(al);
}
Iterator<String> iter = windowHandles.iterator();	//this one is confusion see concept its clear and choose any one method either for each or iterator don mix bcz both have different calling methods for each insersion order iterato random order
String first = iter.next();
String second = iter.next();
String third = iter.next();
String fourth = iter.next();

String tlt = driver.switchTo().window(third).getTitle();
System.out.println(tlt);

WebElement print = driver.findElement(By.xpath("//h3[text()='simple rangoli - YouTube']"));
a.moveToElement(print).contextClick().perform();
String text = print.getText();
System.out.println(text);
Thread.sleep(1000);
boolean selected = print.isSelected();
System.out.println(selected);
boolean displayed = print.isDisplayed();
System.out.println(displayed);



System.out.println("**********");




}

}



