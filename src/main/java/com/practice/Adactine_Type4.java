package com.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.data.BaseClass;
import com.pomclass.Page_Object_Manager;
import com.properties.File_Reader_Manager;

public class Adactine_Type4 extends BaseClass {
public static WebDriver driver = launchBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		launchUrl(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		
		passInput(pom.getInstanceLogin().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		
		passInput(pom.getInstanceLogin().getPassword(),password);
		
		clickTheElement(pom.getInstanceLogin().getLoginbtn());
	}
	


}
