package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayTask {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
				
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<WebElement> iphones = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		System.out.println("size is:"+iphones.size());
		System.out.println("******************");
		for (int i = 0; i <iphones.size(); i++) {
			System.out.println("iphone names are:"+iphones.get(i).getText());
		}
	
	
	}

}
