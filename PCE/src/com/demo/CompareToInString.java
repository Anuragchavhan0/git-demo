package com.demo;

public class CompareToInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1= new String("SACHIN");
		String S2= new String("SAURAV");
		int res = S1.compareTo(S2);
		System.out.println(res);
		if(res>0) {
			System.out.println("S1 is greter ");	
		}
		else if (res<0) {
			System.out.println("S2 is greter ");
		}
			
		else {
			System.out.println("both are equal ");
		}

	}

}
