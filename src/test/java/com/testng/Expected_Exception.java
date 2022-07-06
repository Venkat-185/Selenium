package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void login() {
		int a = 16;
		System.out.println(a/0);
	}

}
