package com.testng;

import org.testng.annotations.Test;

public class Time_Out_Concept {
	
	@Test(timeOut = 9000)
public void login() throws InterruptedException {
	
	 Thread.sleep(2000);
	 System.out.println("Browser launch");
	
	  Thread.sleep(2000);
     System.out.println("Url Launch");
	
	 Thread.sleep(2000);
     System.out.println("Login");
}

}
