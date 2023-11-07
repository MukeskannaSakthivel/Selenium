package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_Actions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Actions - mouse based operations
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(course).click().perform();
		
		
		
		
	}
}
