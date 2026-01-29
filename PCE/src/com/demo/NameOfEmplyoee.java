package com.demo;

import  java.util.Scanner;
public class NameOfEmplyoee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of emplyoees");
		int n = sc.nextInt();
		sc.nextLine();
		
		String a[] = new String[n];
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter name of employee : " + i);
			a[i] = sc.nextLine();
		}
		
		for(int i =0 ;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();

	}

}
