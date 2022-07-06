package com.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner extends  BaseClass  {
	public static void main(String[] args) throws InterruptedException, IOException {
		launchBrowser("chrome");
		
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
	    LoginPage lp = new LoginPage(driver);
	    
	    Thread.sleep(5000);
	    lp.username("Venkat");
	    lp.password("V123456");
	    lp.login();
	    navigateTo("https://www.facebook.com/");
	    navigateBack();
	    navigateForward();
	    get("http://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    alertAccpet();
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    alertAccpet();
	    WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    findElement.sendKeys("Venkat");
	    alertDismiss();
	    takesScreenshot("v1");

	    
	    
	    
	}

}
