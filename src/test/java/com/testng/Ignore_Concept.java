package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	//Ignore 
	@Ignore
	@Test(groups = "Tea")
	public void greenTea(){
		System.out.println("Green Tea");
		}
	
	@Test(groups = "Tea")
	public void lemonTea() {
		System.out.println("Lemon Tea");
	}
	
	@Test(groups = "Tea")
	public void gingerTea() {
		System.out.println("Ginger Tea");
	}
	
	@Test(groups = "Coffee")
	public void blackCoffee() {
		System.out.println("Black Coffee");
	}
	
	@Test(groups = "Coffee")
	public void filterCoffee() {
		System.out.println("Filter Coffee");
		}
	
	@Test(groups = "Soft Drink")
	public void pepsi() {
		System.out.println("Pepsi"); 
		}
	@Test(groups = "Soft Drink",enabled = false)
	public void fanta() {
		System.out.println("Fanta");
	}

}
