package com.exception;

import java.util.Scanner;

class Test31{
	void gamma1() throws Exception{
		System.out.println("Connection 31 establish : ");
		Scanner sc = new  Scanner(System.in);
		System.out.print("Please Enter 1st number :   ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd number :   ");
		int b = sc.nextInt();
		int c=a/b;
		System.out.println("Connection 31 terminanated : ");
}
}
public class Exceprion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main Connection establish : ");
		Test31 t1= new Test31();
		try {
			t1.gamma1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println(" main Connection terminated  ");

   }

	
}

