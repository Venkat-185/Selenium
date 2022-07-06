package com.pomclass;

import org.openqa.selenium.WebDriver;

import com.data.BaseClass;

public class Runner2 extends BaseClass {
	public static WebDriver driver = launchBrowser("chrome");
	
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[]args) {
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		
	//	passInput(pom.getInstanceLogin().getUsername(), "vijayvenkat740");
	//	passInput(element, string);
		
		passInput(pom.getInstanceLogin().getPassword(), "Venkat07@");
		
		clickTheElement(pom.getInstanceLogin().getLoginbtn());
		
		
	}
	
	
	

}
