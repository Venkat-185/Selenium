package com.practice;
//ADACTINE MINI PROJECT WITHOUT USING BASE CLASS,PAGE OBJEC MODEL,
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactine_type1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesan"
				+ "\\SeleniumCourse\\SelenimTesting2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(5000);
		WebElement a1 = driver.findElement(By.xpath("//input[@type='text']"));
		a1.sendKeys("vijayvenkat740");
		
		WebElement a2 = driver.findElement(By.xpath("//input[@type='password']"));
		a2.sendKeys("Venkat07@");
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		Thread.sleep(5000);
		WebElement b1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(b1);
		s1.selectByValue("London");
		
		WebElement b2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s2 = new Select(b2);
		s2.selectByValue("Hotel Sunshine");
		
	      WebElement b3 = driver.findElement(By.xpath("//select[@name='room_type']"));
	      Select s3 = new Select(b3);
	      s3.selectByValue("Super Deluxe");
	      
	      WebElement b4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
	      Select s4 = new Select(b4);
	      s4.selectByValue("2");
	      
	      WebElement b5 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	      b5.sendKeys("23/06/2022");
	      
	      WebElement b6 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	      b6.sendKeys("24/06/2022");
	      
	      WebElement b7 = driver.findElement(By.xpath("//select[@name='adult_room']"));
	      Select s7 = new Select(b7);
	      s7.selectByValue("2");
	      
	      WebElement b8 = driver.findElement(By.xpath("//select[@name='child_room']"));
	      Select s8 = new Select(b8);
	      s8.selectByValue("1");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      Thread.sleep(5000);
	      WebElement c1 = driver.findElement(By.xpath("//input[@name='first_name']"));
	      c1.sendKeys("Venkatesan");
	      
	      WebElement c2 = driver.findElement(By.xpath("//input[@name='last_name']"));
	      c2.sendKeys("Ramadoss");
	      
	      WebElement c3 = driver.findElement(By.xpath("//textarea[@name='address']"));
	      c3.sendKeys("123 abc Street");
	      
	      WebElement c4 = driver.findElement(By.xpath("//input[@name='cc_num']"));
	      c4.sendKeys("7878565612123636");
	      
	      WebElement c5 = driver.findElement(By.xpath("//select[@name='cc_type']"));
	      Select sc5 = new Select(c5);
          sc5.selectByValue("VISA");
          
          WebElement c6 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
          Select sc6 = new Select(c6);
          sc6.selectByValue("12");
          
          WebElement c7 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
          Select sc7 = new Select(c7);
          sc7.selectByValue("2022");
          
          WebElement c8 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
          c8.sendKeys("5555");
          
          driver.findElement(By.xpath("//input[@type='button']")).click();
          
		
	}

}
