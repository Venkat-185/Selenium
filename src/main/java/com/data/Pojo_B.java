package com.data;

public class Pojo_B {
	public static void main(String[] args) {
		Pojo_A a = new Pojo_A();
		
//		int id = a.getId();
//		System.out.println(id);
		int id =a.getId();
		System.out.println(id);
		
		a.setId(123);
		int id2 = a.getId();
		System.out.println(id2);
		
		a.setId(456);
		int id3 = a.getId();
		System.out.println(id3);
		System.out.println(id2);
		
	}

}
