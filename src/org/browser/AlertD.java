package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertD {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Options o = driver.manage();
		Window w = o.window();
		w.maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
	}
}
