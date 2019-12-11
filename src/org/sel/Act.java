package org.sel;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//QUESTION 4
		
		WebElement submit = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		submit.click();
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karthick");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("raja");
		Alert acc = driver.switchTo().alert();
		acc.accept();
		
		
	}

}
