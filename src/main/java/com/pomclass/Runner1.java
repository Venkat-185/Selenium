package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.data.BaseClass;

public class Runner1 extends BaseClass {

		
		public static WebDriver driver = launchBrowser("chrome");
		public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
		public static void main(String[] args) {
			launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
			
			passInput(pom.getInstanceLogin().getUsername(), "vijayvenkat740");
			
			passInput(pom.getInstanceLogin().getPassword(), "Venkat07@");
			
			clickTheElement(pom.getInstanceLogin().getLoginbtn());
		}
		
		

	}


