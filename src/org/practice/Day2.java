package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	//Launch Browser 
	//Launch URL
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		
		driver.get("https://www.facebook.com/");
		
		//to Get Title of web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.close();
		
		
		
		
	}
}
