package org.seleniumtask.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLAunch
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.google.com/search?q=insta&oq=insta&aqs=chrome.0.69i59j35iU33RgDi1ytTB7Yse9cJzD97mCycTQ1512j0i131i433i512l2j0i131i433j0i131i433i512j0i512.2736j0j9&sourceid=chrome&ie=UTF-8");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com/search?q=facebook&oq=face&aqs=chrome.0.69i59j69i57j0i271l2j69i61l2j69i60.1080j0j9&sourceid=chrome&ie=UTF-8");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.google.com/search?q=twitter&oq=twitter&aqs=chrome..69i57j0i271l2.2732j0j9&sourceid=chrome&ie=UTF-8");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title2 = driver.getTitle();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(title2);
		System.out.println(currentUrl2);
		driver.close();
		
	}

}
