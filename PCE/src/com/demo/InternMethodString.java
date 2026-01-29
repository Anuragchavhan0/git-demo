package com.demo;

public class InternMethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1= new String("deep");
		String S2=S1.intern();
		String S3=S1.intern();
		if(S2==S3) {
			System.out.println("Reference are equal ");	
		}
		else {
			System.out.println("Reference are not  equal ");
		}
//		if(S1.equals (S2)) {
//			System.out.println("value are equal ");	
//		}
//		else {
//			System.out.println("value are not  equal ");
//		}
	}

	

}
