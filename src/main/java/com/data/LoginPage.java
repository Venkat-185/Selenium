package com.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public WebDriver driver;
   
   public LoginPage(WebDriver driver2) {
	   this.driver =driver2;
	  PageFactory.initElements(driver2, this);
   }
   
	public  void username(String a1) {
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys(a1);

	}
	public void password(String a2) {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(a2);


	}
	public void login() {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

	}
}
