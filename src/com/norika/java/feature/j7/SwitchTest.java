package com.norika.java.feature.j7;

public class SwitchTest {

	public static void main(String[] args) {
		int a = 0B1000_0000_0000_0000_0000_0000_0000_0011;
		
		String s = "test";

		switch (s) {
		case "test":
			System.out.println("test");
		case "test1":
			System.out.println("test1");
			break;
		default:
			System.out.println("break");
			break;
		}
		
		System.out.println(a);
	}

}
