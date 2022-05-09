package com.Sele_Webpage;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//img[contains(@class, 'svg-image')])[5]")).click();
			WebElement single = driver.findElement(By.xpath("//select[@id='dropdown1']"));
			Select s=new Select(single);
			s.selectByVisibleText("Appium");
			
			WebElement multi = driver.findElement(By.xpath("(//select)[4]"));
			Select s1=new Select(multi);
			s1.selectByVisibleText("Selenium");
			s1.selectByValue("0");
			s1.selectByIndex(3);
			
		 
		    }

	}


