package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_XpathFunctions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//xpath functions
		//text()
		//contains()
		//getText()
				WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Fac')]"));
				String value = text.getText();
				System.out.println(value);
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		//To get attribute value
		String attribute = username.getAttribute("placeholder");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1111111111");
		
		//using text method
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//using contains
		driver.findElement(By.xpath("//button[contains(text(),'Lo')]")).click();
		
		
		//To fetch the attribute value
		
		
	}
}
