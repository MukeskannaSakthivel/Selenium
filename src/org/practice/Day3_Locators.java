package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		
		driver.get("https://www.facebook.com/");
		//Locators
		/*id
		name
		className
		xpath
		LinkText
		PartiallyLinkText
		CssSelectors*/
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Ravi");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1111");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
				
	}
}
