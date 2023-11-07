package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
}
