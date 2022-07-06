package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Simple Annotation
//Invocation Count
//Priority

public class Simple_Annotaion {
	
	@BeforeSuite
	public void setProperty() {
		
		System.out.println("Set Property");
	}
	@BeforeTest
	public void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	@BeforeClass
  public void urlLaunch() {
	  
	  System.out.println("Url Launch");
  }
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	@Test(priority = 8, invocationCount = 2)
	public void insta() {
		System.out.println("Instagram");
	}
	@Test(priority = 7)
	public void fb() {
		System.out.println("Facebook");
	}
	@Test(priority = 9)
	public void yt() {
		System.out.println("Youtube");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	@AfterClass
	public void screenshot() {
		System.out.println("ScreenShot");
	}
  @AfterTest
  public void close() {
	  System.out.println("Close");
  }
  @AfterSuite
  public void Quit() {
	  System.out.println("Quit");
  }
}
