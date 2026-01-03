package com.exception;

import java.util.Scanner;

public class ExceptionAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" connection establised");
		System.out.println("Please enter value 1 : ");
		int a = sc.nextInt();	
		System.out.println("Please enter value 2 : ");
		int b = sc.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println(" Congralutions connection  has terminated");
	}
	
	

}
