package org.sel;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSample {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Question 9
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 11 (Black, 128 GB)')]")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Karthick\\Poovarasi\\Selenium\\Raja.png");
		FileUtils.copyFile(s,d);
		
		
		
		
	}

	
	
	
	
	
}
