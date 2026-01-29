package com.demo;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number of classes: ");
		int n = sc.nextInt();
		System.out.println(" Enter the number of student: ");
		int m = sc.nextInt();
		
		int a[][]  = new int[n][m];
		
	
		for(int i = 0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.println(" Enter marks of class " + i + " student" +  j);
				a[i][j]= sc.nextInt();
			}
			
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
		
		
		sc.close();
	
		}
	
	}
	
	 

}
