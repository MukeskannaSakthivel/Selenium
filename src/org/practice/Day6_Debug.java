package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//to find the exact position of an error
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Ravi");
		driver.findElement(By.xpath("(//button[contains(text(),'Sign')])[1]")).click();
	}
}
