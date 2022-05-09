package com.Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project_2Mini {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\'categories_block_left\']/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		image.click();
		driver.switchTo().frame(0);
		WebElement qty = driver.findElement(By.id("quantity_wanted"));
		qty.clear();
		qty.sendKeys("2");
		WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		 Select s=new Select(size);
		 s.selectByVisibleText("L");
		 driver.findElement(By.id("color_24")).click();
		 driver.findElement(By.id("add_to_cart")).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		 driver.findElement(By.id("email")).sendKeys("kaviarasan93ar@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("1234567*");
		 driver.findElement(By.id("SubmitLogin")).click();
		 driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		 driver.findElement(By.id("cgv")).click();
		 driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Screenshot\\order.png");
		 FileHandler.copy(source, dest);
		 
		 driver.quit();
		 
		
		
		

		
		
		
	}

}
