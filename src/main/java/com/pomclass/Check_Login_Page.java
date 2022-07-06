package com.pomclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.data.BaseClass;
import com.data.LoginPage;

public class Check_Login_Page extends BaseClass {
	public static void main(String[] args) {

		// login page without using Baseclass and login_page

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesan"
//				+ "\\SeleniumCourse\\SelenimTesting2"
//				+ "\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
//		
//		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
//		e1.sendKeys("vijayvenkat740");
//		
//		WebElement e2 = driver.findElement(By.xpath("//input[@type='password']"));
//		e2.sendKeys("Venkat07@");
//		
//		driver.findElement(By.xpath("//input[@type='Submit']")).click();
//		
		
		
       //login page with using baseclass
//		launchBrowser("Chrome");
//		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
//
//		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
//		passInput(e1, "vijayvenkat740");
//
//		WebElement e2 = driver.findElement(By.xpath("//input[@type='password']"));
//		passInput(e2, "Venkat07@");
//
//		WebElement e3 = driver.findElement(By.xpath("//input[@type='Submit']"));
//		clickTheElement(e3);
		
		//loginpage with using baseclass and login_page
		
		launchBrowser("chrome");
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		Login_Page lp = new Login_Page(driver);
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		passInput(lp.getUsername(), "vijayvenkat740");
		
		passInput(lp.getPassword(), "Venkat07@");
		
		clickTheElement(lp.getLoginbtn());
		
		//WebElement s1 = driver.findElement(By.xpath("//select[@name='location']"));
		//select1(s1,"Melbourne");
		
		WebElement s1 = driver.findElement(By.xpath("//select[@name='location']"));
		
		
		
		
		
		
		
	}
}
		
		
		



