package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.facebook.com/");
		cdriver.manage().window().maximize();
		//Locate Email Text box
		WebElement txtEmail = cdriver.findElement(By.id("email"));
		txtEmail.sendKeys("mukes@gmail.com");
		//locate Password Text box
		cdriver.findElement(By.name("pass")).sendKeys("Mukes123@");
		//locate login button
		cdriver.findElement(By.name("login")).click();
	}
}
