package com.practice;

import org.openqa.selenium.WebDriver;

import com.data.BaseClass;
import com.pomclass.Page_Object_Manager;

public class Adactine_Type3 extends BaseClass {
	
	public static WebDriver driver = launchBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) {
          
		
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		passInput(pom.getInstanceLogin().getUsername(), "vijayvenkat740");
		
		passInput(pom.getInstanceLogin().getPassword(), "Venkat07");
		
		clickTheElement(pom.getInstanceLogin().getLoginbtn());
		
		
		
		
	}

}
