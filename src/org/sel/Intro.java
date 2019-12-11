package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Intro {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("(//span[text()=' Introduction'])[1]"));
		String b = s.getText();
		System.out.println(b.substring(0, 5));
	}

}
