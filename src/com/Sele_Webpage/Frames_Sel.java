package com.Sele_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		WebElement single = 
				driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(single);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(outer);
		WebElement inner = driver.findElement(By.name("frame2"));
		driver.switchTo().frame(inner);
		driver.findElement(By.id("Click1")).click();
		
		
		
		
		

	}

}
