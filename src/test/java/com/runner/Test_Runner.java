package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.data.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com.stepdefinition",
                   monochrome =true, dryRun= false, strict =false,

plugin = {"html:V1/Report.html","json:V1/cucumber.json", "pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:V1/Adactine.html"})

public class Test_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void stepUp() {
		driver = BaseClass.launchBrowser("chrome");
	}
	
    @AfterClass
	public static void tearDown() {
	driver.close();
		
	}
}
