package com.practice;


import com.data.BaseClass;
import com.pomclass.Login_Page;

public class Adactine_type2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

        launchBrowser("Chrome");
		
		launchUrl("https://adactinhotelapp.com/");
		
		Login_Page lp = new Login_Page(driver);
		
		Thread.sleep(5000);
		
	    passInput(lp.getUsername(), "vijayvenkat740");
		
	    passInput(lp.getPassword(), "Venkat07");
	    
	    clickTheElement(lp.getLoginbtn());
		
		
	}
	
	

}
