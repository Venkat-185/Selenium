package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	
    @Test
	public void seventh() {
		System.out.println("7TH Pass");
	}
    
    @Test(dependsOnMethods = "seventh")
    public void eighth() {
    	System.out.println("8TH Pass");
    }
    
    @Test(dependsOnMethods = "eighth")
    public void ninth() {
    	System.out.println("9TH Pass");
    }
    
   
    @Test(dependsOnMethods = "ninth")
    public void tenth() {
    	System.out.println("10TH Pass");
    }
    
    @Test(dependsOnMethods = "tenth")
    public void eleventh() {
    	System.out.println("11TH Pass");
    }
    
    @Test(dependsOnMethods = "eleventh")
	public void twelfth() {
		System.out.println("12TH Pass");
	}
}
