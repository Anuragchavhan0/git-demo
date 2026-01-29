package com.demo;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1= "Arsh";
		String S2="Arsh";
		String S3 = new String("Arsh");
		String S4 = new String (" arsh ");
		if(S1==S3) {
			System.out.println("Reference are equal ");	
		}
		else {
			System.out.println("Reference are not  equal ");
		}
		if(S1.equals (S3)) {
			System.out.println("value are equal ");	
		}
		else {
			System.out.println("value are not  equal ");
		}
	}
	
	
}
