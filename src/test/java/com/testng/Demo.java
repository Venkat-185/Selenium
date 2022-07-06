package com.testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo {
	
	@Test
	public void demoUsername() {
		
		String exp = "Venkat";
		
		String act = "Venkat";
		
		Assert.assertEquals(act, exp);
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public void demoPassword() {
		int exp= 123;
		exp+=332;
		exp++;
		int  act= 456;
		
		Assert.assertEquals(act, exp);
		
		
	}

}
