package com.Sele_Webpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handler {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);	
		WebElement best = driver.findElement
				(By.xpath("//a[text()='Best Sellers']"));
		Actions a =new Actions(driver);
		a.contextClick(best).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		WebElement mobiles = driver.findElement
				(By.xpath("//a[text()='Mobiles']"));
		Actions b =new Actions(driver);
		b.contextClick(mobiles).build().perform();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		for (String id : set) {
			driver.switchTo().window(id);
			
		}
		
		

	}

}
