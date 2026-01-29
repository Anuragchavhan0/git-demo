package com.demo;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1= "md";
		String S2="Arsh";
		S1=S1.concat(S2);
		System.out.println(S1);
		if(S1==S2) {
			System.out.println("Reference are equal ");	
		}
		else {
			System.out.println("Reference are not  equal ");
		}
		if(S1.equals (S2)) {
			System.out.println("value are equal ");	
		}
		else {
			System.out.println("value are not  equal ");
		}
	}

}
