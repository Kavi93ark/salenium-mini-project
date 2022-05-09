package com.Sele_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@tabindex='0'])[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@tabindex = '0'])[8]")).click();
		driver.navigate().back();
		driver.quit();
	}

}
