package com.testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Hard_Assert_Concept {
	
	@Test
	public void demo() {
		String exp = "Venkat";
		
		String act= "venkat";
		
		Assert.assertEquals(exp, act);
		
		System.out.println("Validation");
		
	}

}
