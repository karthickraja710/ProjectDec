package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karthick\\Poovarasi\\Selenium\\fox\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		
		
		
		
		
		
	}

}
