package org.selenium.concept.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanch {
	public static void main(String[] args) {
		
//					all small cases only allowed in key, value(alt+enter-->ctrl+a,ctrl+c,ctrl+paste)
//					System.setProperty(key, value)
//										(reel web driver,path of the web driver) not path of the java
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri\\eclipse-workspace\\Selenium-Sep\\Driver\\chromedriver.exe");	

//Interface    //var.name        //Class
WebDriver driver = new ChromeDriver();		//upcasting to create a reel browser

driver.manage().window().maximize();		//to manage windows.. this will help to appear the testcase windows in fullscreen

driver.manage().window().fullscreen();//to fix the windows in full screen

driver.get("https://chromedriver.chromium.org/");	//to call the webpage get used
			//in string args we have to enter the url which we going to test
			//in that get method browser works upto get full pase setup
			//in that get method string args ended with / it. means browser works upto full pageset comes
driver.navigate().to("https://www.google.com/search?gs_ssp=eJzj4tLP1TfIyK1MKy5TYDRgdGDw4khLTE5Nys_PBgBmYAfL&q=facebook&oq=face&aqs=chrome.1.69i57j46i131ajatRTCRHFhKFpk38FZEzqH2tQs8ZZj0i433i512l2j0i512l3j0i131i433i512j0i271.2742j0j7&sourceid=chrome&ie=UTF-8");
			//om that string args we have to enter the url which we going to navigate 
			//navigate in the sense we have to throw the url we have to test
			//not ended up / means once browser enter the navigated url then it goes to the next work and it cant wait for full page setup

driver.navigate().back();		//used to call the browser back

driver.navigate().forward();	//used to call the browser to farward

driver.navigate().refresh();	//used to refresh the browser


//return type var.name class
String title = driver.getTitle();	//used to get title of the currect page
System.out.println(title);

String currentUrl = driver.getCurrentUrl();  //used to get the current url 
System.out.println(currentUrl);

driver.close();				//used to close the current tab

//driver.quit();				//close all the tabs
}
}