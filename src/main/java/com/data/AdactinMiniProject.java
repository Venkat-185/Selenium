package com.data;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinMiniProject extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesan"
//				+ "\\SeleniumCourse\\SelenimTesting2"
//				+ "\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		launchBrowser("chrome");
		
		//driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		//email.sendKeys("vijayvenkat740");
		passInput(email, "vijayvenkat740");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("Venkat07@");
		passInput(pass, "Venkat07@");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		//login.click();
		clickTheElement(login);
		
		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.xpath("//select[@name='location']"));
		//Select s1 = new Select(e1);
		//s1.selectByValue("London");
		selectByValue(e1, "London");
		
		WebElement e2 = driver.findElement(By.xpath("//select[@name='hotels']"));
	//  Select s2 = new Select(e2);
	//	s2.selectByValue("Hotel Sunshine");
		selectByValue(e2, "Hotel Sunshine");
		
		WebElement e3 = driver.findElement(By.xpath("//select[@name='room_type']"));
	//	 Select s3 = new Select(e3);
	//	s3.selectByValue("Double");
		selectByValue(e3, "Double");
		
		WebElement e4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
	//	Select s4 = new Select(e4);
	//	s4.selectByValue("1");
		selectByValue(e4, "1");
		
		WebElement e5 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	//	e5.sendKeys("07/06/2022");
		passInput(e5, "08/06/2022");
		
		WebElement e6 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	//	e6.sendKeys("08/06/2022");
		passInput(e6, "09/06/2022");
		
		WebElement e7 = driver.findElement(By.xpath("//select[@name='adult_room']"));
	//	Select s7 = new Select(e7);
	//	s7.selectByValue("2");
		selectByValue(e7, "2");
		
		WebElement e8 = driver.findElement(By.xpath("//select[@name='child_room']"));
	//	Select s8 = new Select(e8);
	//	s8.selectByValue("1");
		selectByValue(e8, "1");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		Thread.sleep(5000);
		WebElement e9 = driver.findElement(By.xpath("//input[@name='first_name']"));
		e9.sendKeys("Venkat");
		
		WebElement e10 = driver.findElement(By.xpath("//input[@name='last_name']"));
		e10.sendKeys("Ramadoss");
		
		WebElement e11 = driver.findElement(By.xpath("//textarea[@name='address']"));
		e11.sendKeys("30th Street");
		
		WebElement e12 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		e12.sendKeys("1111222233337894");
		
		WebElement e13 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s13 = new Select(e13);
		s13.selectByValue("VISA");
		
		WebElement e14 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s14 = new Select(e14);
		s14.selectByValue("12");
		
		WebElement e15 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s15 = new Select(e15);
		s15.selectByValue("2022");
		
		WebElement e16 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		e16.sendKeys("2445");
		
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Venkatesan\\SeleniumCourse\\SelenimTesting2\\Screenshot\\room2.png");
		
		FileHandler.copy(source, des);
		
		
	}

}
