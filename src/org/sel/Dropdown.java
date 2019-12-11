package org.sel;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
				
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tsps");
		driver.manage().window().maximize();
		//WebElement continents = driver.findElement(By.xpath(""));
		
		
		
	}
		
		
		
		
		
		}

