package com.Sele_Webpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_capture {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	      
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("kaviarasan93ar");
		driver.findElement(By.name("password")).sendKeys("1234567*");
		driver.findElement(By.id("login")).click();
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Screenshot\\Screenshot.png");
		FileHandler.copy(source, destination);
	}

}
