package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Test
	@Parameters({"username1","password1"})
	public void login1(@Optional("VP")String user,String pass) {
		
		System.out.println("USERNAME IS "+user);
		
		System.out.println("PASSWORD IS "+pass);
	}

}
