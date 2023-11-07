package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrameset {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		driver.manage().window().maximize();
		//driver.switchTo().frame("login_page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='_aa4a'])[1]"));
	}
}
