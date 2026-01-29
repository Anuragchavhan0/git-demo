package com.demo;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 10 , 20 , 30 , 40 , 50};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Please enter the Index 1 to swap ");
		int Indx1 = sc.nextInt();
		System.out.println("Please enter the Index 2 to swap ");

		int Indx2 = sc.nextInt();
		int temp = a[Indx1];
		a[Indx1]= a[Indx2];
		a[Indx2]= temp;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
			sc.close();
		}
		
	
		
		
	}

}
