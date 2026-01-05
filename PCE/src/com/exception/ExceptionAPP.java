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
			
			System.out.println("Please enter size of an array : ");
			int size = sc.nextInt();
			
			int arr[]=new  int[size];
			System.out.println("Please enter index no.array : ");
			int n = sc.nextInt();
			arr[n]=999;
			
			// Exception e is a parent catch block . but if we define it at top below catch will throw  error.
			//remaining catch block will be unreacheble 
			
			
		}/*catch(Exception e) {
			e.printStackTrace();
			System.out.println("Divided by zero is not allowed ");
		}*/
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Divided by zero is not allowed ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("plese define the index ");
		}
		catch(NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("Plese enter the positive number ");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Divided by zero is not allowed ");
		}
		System.out.println("Congralutions connection  has terminated");
	}

}

// as seen in the above program regardless of the the type pf option we reductive the same message this is because we are using a single catch block.
// this disadvantage can be over come by making the use of multiple catch block .


















