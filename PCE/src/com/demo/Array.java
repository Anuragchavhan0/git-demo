package com.demo;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  of  Students");
		int n = sc.nextInt();
	    int a[] = new int[n];
	
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the marks of student : " +i);
			a[i]=sc.nextInt();
			
		}
		
		//o/p
		for(int i =0 ;i<a.length;i++) {
			System.out.print(a[i] + " ");
			
		}
		sc.close();

	}

}
