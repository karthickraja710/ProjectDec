package org.sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revison {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\Poovarasi\\Selenium\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.greenstechnologys.com/contact.php");
		driver.manage().window().maximize();
		
		List<WebElement> address = driver.findElements(By.xpath("//*[@class='address-block address-border']"));
		for(int i=0; i<address.size();i++)
		{
			String s = address.get(i).getText();
			System.out.print(s);
		}
		
		//Question 8	
//		driver.get("https://get.google.com/apptips/apps/?utm_source=googlemobile&utm_campaign=redirect#!/all");
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.findElements(By.xpath("//img[@src='/apptips/images/google-play.png']")).size());
//		//driver.findElement(By.xpath("(//img[@src='/apptips/images/google-play.png'])[2]")).click();
//		List<WebElement> li = driver.findElements(By.xpath("//img[@src='/apptips/images/google-play.png']"));
//		for(int i=0; i<li.size();i++)
//		{
//			driver.findElements(By.xpath("//img[@src='/apptips/images/google-play.png']")).get(i).click();
//		}
			
		}
		
	}


