package com.pomclass;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	// private datatype variable;
	// private WebElement refname;
	// private Classname objname;

	public WebDriver driver;
	private Login_Page lp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}



	public Login_Page getInstanceLogin() {
		if (lp == null) {
			lp = new Login_Page(driver);

		}
		return lp;
	}
}
