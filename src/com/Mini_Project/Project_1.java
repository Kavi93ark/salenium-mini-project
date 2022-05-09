package com.Mini_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project_1 {

	public static void main(String[] args) throws IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("kaviarasan93ar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567*");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement Single = driver.findElement(By.id("location"));
		Select s=new Select(Single);
		s.selectByIndex(5);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Double");
		WebElement no_rooms = driver.findElement(By.id("room_nos"));
		Select s3=new Select(no_rooms);
		s3.selectByVisibleText("3 - Three");
		driver.findElement(By.id("datepick_in")).sendKeys("30/03/2022");
        driver.findElement(By.id("datepick_out")).sendKeys("05/04/2022");
        WebElement adult = driver.findElement(By.id("adult_room"));
        Select s4=new Select(adult);
        s4.selectByVisibleText("2 - Two");
        WebElement child = driver.findElement(By.id("child_room"));
        Select s5=new Select(child);
        s5.selectByVisibleText("2 - Two");
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("first_name")).sendKeys("kavi");
        driver.findElement(By.id("last_name")).sendKeys("Rajendran");
        driver.findElement(By.id("address")).sendKeys("sdfhsf,dgfvds,sdh");
        driver.findElement(By.id("cc_num")).sendKeys("1234567891254789");
        WebElement cardtype = driver.findElement(By.id("cc_type"));
        Select s6=new Select(cardtype);
        s6.selectByValue("MAST");
        WebElement selectmonth = driver.findElement(By.id("cc_exp_month"));
        Select s7=new Select(selectmonth);
        s7.selectByValue("9");
        WebElement selectyear = driver.findElement(By.id("cc_exp_year"));
        Select s8=new Select(selectyear);
        s8.selectByValue("2022");
        driver.findElement(By.id("cc_cvv")).sendKeys("2578");
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("my_itinerary")).click();
        TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Rajakumaran\\eclipse-workspace\\Selenium\\Screenshot\\Screenshot3.png");
		FileHandler.copy(source, destination);
        
	}

}
