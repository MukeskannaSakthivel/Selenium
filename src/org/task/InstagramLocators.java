package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[1]")).sendKeys("abcde");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	}
}
