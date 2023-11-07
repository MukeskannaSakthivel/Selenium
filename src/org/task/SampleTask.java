package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mobileNoInp")).sendKeys("741819");
	}
}
