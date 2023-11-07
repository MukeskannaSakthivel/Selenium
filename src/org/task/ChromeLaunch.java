package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KALAIVANI\\eclipse-workspace\\SELENIUM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement textFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		textFirstName.sendKeys("mukes@gmail.com");
		WebElement textLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		textLastName.sendKeys("Mukes@123");
		WebElement textAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		textAddress.sendKeys("Erode");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("mukes@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("741819837");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Eng')]")).click();
		driver.findElement(By.xpath("//div[@class='row ']")).click();
		driver.findElement(By.xpath("//select[@ng-model='Skill']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Jav')][1]")).click();
		//driver.findElement(By.xpath("//div[@class='row ']")).click();
		driver.findElement(By.className("row")).click();
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//select[@id='yearbox']")).click();
		driver.findElement(By.xpath("//option[text()='1998']")).click();
		
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		
		driver.findElement(By.xpath("//option[text()='August']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
		driver.findElement(By.xpath("//option[text()='22']")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("12345abc");
		driver.findElement(By.id("secondpassword")).sendKeys("12345abc");
		driver.findElement(By.id("submitbtn")).click();
	}
}
