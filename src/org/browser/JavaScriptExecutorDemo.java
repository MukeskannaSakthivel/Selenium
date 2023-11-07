package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','red')", username);
		
		WebElement password = driver.findElement(By.id("pass"));
		j.executeScript("arguments[0].setAttribute('value','ravi')",password);
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		j.executeScript("arguments[0].click()", loginBtn);
	}
	
}
