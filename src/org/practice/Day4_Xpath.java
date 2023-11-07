package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.xpath
				("//input[@placeholder='Email address or phone number']"));
		username.sendKeys("Ravikumar");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("11111");

		driver.findElement(By.xpath("//button[@value='1']")).click();




	}
}
