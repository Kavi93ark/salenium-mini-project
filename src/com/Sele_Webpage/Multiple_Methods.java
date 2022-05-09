package com.Sele_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		
		multiple.click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		 driver.switchTo().alert().sendKeys("selenium");
	     driver.switchTo().alert().accept();
	}
}