package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.data.BaseClass;
import com.pomclass.Page_Object_Manager;
import com.properties.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();

		launchUrl(url);
	}

	@When("^user Enter The  \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		passInput(pom.getInstanceLogin().getUsername(), username);

	}
	
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {

		passInput(pom.getInstanceLogin().getPassword(), password);
	}

	@Then("^user Click TheLogin Button And It Navigates to The Search Hotel Page$")
	public void user_Click_TheLogin_Button_And_It_Navigates_to_The_Search_Hotel_Page() throws Throwable {

		clickTheElement(pom.getInstanceLogin().getLoginbtn());

	}
	
	@When("^user Select The \"([^\"]*)\" In The Location Field$")
	public void user_Select_The_In_The_Location_Field(String arg1) throws Throwable {
		WebElement b1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(b1);
		s1.selectByValue(arg1);
	}
	
	@When("^user Select The \"([^\"]*)\" In The Hotels Field$")
	public void user_Select_The_In_The_Hotels_Field(String arg1) throws Throwable {
		WebElement b2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s2 = new Select(b2);
		s2.selectByValue(arg1);
	}

	@When("^user Select The \"([^\"]*)\" In The Room Type Field$")
	public void user_Select_The_In_The_Room_Type_Field(String arg1) throws Throwable {
		 WebElement b3 = driver.findElement(By.xpath("//select[@name='room_type']"));
	      Select s3 = new Select(b3);
	      s3.selectByValue(arg1);
	}

	@When("^user Select The \"([^\"]*)\" In The Number Of Rooms$")
	public void user_Select_The_In_The_Number_Of_Rooms(String arg1) throws Throwable {
		   WebElement b4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		      Select s4 = new Select(b4);
		      s4.selectByValue(arg1);
	}

	@When("^user Select The \"([^\"]*)\" In The Adults Per Room$")
	public void user_Select_The_In_The_Adults_Per_Room(String arg1) throws Throwable {
		 WebElement b7 = driver.findElement(By.xpath("//select[@name='adult_room']"));
	      Select s7 = new Select(b7);
	      s7.selectByValue(arg1);
	}

	@When("^user Select The \"([^\"]*)\" In The Childerns Per Room$")
	public void user_Select_The_In_The_Childerns_Per_Room(String arg1) throws Throwable {
		 WebElement b8 = driver.findElement(By.xpath("//select[@name='child_room']"));
	      Select s8 = new Select(b8);
	      s8.selectByValue(arg1);   
	}
	
	@Then("^user Click The Search Button It Naviagates To The Search Hotel Page$")
	public void user_Click_The_Search_Button_It_Naviagates_To_The_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^user Select The Radio Button Field$")
	public void user_Select_The_Radio_Button_Field() throws Throwable {
		 driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Click the Continue Button And Its Navigates To Book Hotel Page$")
	public void user_Click_the_Continue_Button_And_Its_Navigates_To_Book_Hotel_Page() throws Throwable {
	      driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("^user Enter \"([^\"]*)\" In The Firstname Field$")
	public void user_Enter_In_The_Firstname_Field(String arg1) throws Throwable {
		  WebElement c1 = driver.findElement(By.xpath("//input[@name='first_name']"));
	      c1.sendKeys(arg1);
	}

	@When("^user Enter \"([^\"]*)\" In The Lastname Field$")
	public void user_Enter_In_The_Lastname_Field(String arg1) throws Throwable {
		  WebElement c2 = driver.findElement(By.xpath("//input[@name='last_name']"));
	      c2.sendKeys(arg1);
	      
	}

	@When("^user Enter \"([^\"]*)\" In The Billing Address Field$")
	public void user_Enter_In_The_Billing_Address_Field(String arg1) throws Throwable {
		 WebElement c3 = driver.findElement(By.xpath("//textarea[@name='address']"));
	      c3.sendKeys(arg1);
	}

	@When("^user Enter \"([^\"]*)\" In The Credit Card Field$")
	public void user_Enter_In_The_Credit_Card_Field(String arg1) throws Throwable {
		 WebElement c4 = driver.findElement(By.xpath("//input[@name='cc_num']"));
	      c4.sendKeys(arg1);

	}

	@When("^user Select \"([^\"]*)\" In The Cc Type Field$")
	public void user_Select_In_The_Cc_Type_Field(String arg1) throws Throwable {
		 WebElement c5 = driver.findElement(By.xpath("//select[@name='cc_type']"));
	      Select sc5 = new Select(c5);
         sc5.selectByValue(arg1);
	}

	@When("^user Select \"([^\"]*)\" In The Expiry Month Field$")
	public void user_Select_In_The_Expiry_Month_Field(String arg1) throws Throwable {
		  WebElement c6 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
          Select sc6 = new Select(c6);
          sc6.selectByValue(arg1);
	}

	@When("^user Select \"([^\"]*)\" In The Expiry year Field$")
	public void user_Select_In_The_Expiry_year_Field(String arg1) throws Throwable {
		WebElement c7 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
        Select sc7 = new Select(c7);
        sc7.selectByValue(arg1);
        }
	
	@When("^user Enter \"([^\"]*)\" In The Cvv Field$")
	public void user_Enter_In_The_Cvv_Field(String arg1) throws Throwable {
		 WebElement c8 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
         c8.sendKeys(arg1);
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
        driver.findElement(By.xpath("//input[@type='button']")).click();
    
	}



}
