package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.data.BaseClass;

public class Qapractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");

		launchUrl("https://demoqa.com/elements");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='item-0']")).click();

		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		passInput(e1, "Venkatesan");
		
		WebElement e2 = driver.findElement(By.xpath("//input[@autocomplete='off' and @placeholder='name@example.com']"));
		passInput(e2, "venkat@gmail.com");
		
		WebElement e3 = driver.findElement(By.xpath("(//textarea[contains(@rows, '5')])[1]"));
		passInput(e3, "abc Street");
		
		WebElement e4 = driver.findElement(By.xpath("(//textarea[contains(@rows, '5')])[2]"));
		passInput(e4, "abc Street");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button' and @id='submit']")).click();
		//WebElement e5 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		//clickTheElement(e5);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='item-2']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		
	}

}
