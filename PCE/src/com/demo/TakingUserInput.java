package com.demo;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Please Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Please Enter your age : ");
		int  age = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter your Gender : ");
		String gender = sc.next();
		sc.nextLine();
		System.out.println("Please Enter your Address : ");
		String address = sc.nextLine();
		System.out.println("Please Enter your collage ID : ");
		int collage_Id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter your collage Name : ");
		String collage_Name = sc.nextLine();
		System.out.println("Please Enter your Email : ");
		String email = sc.nextLine();
		System.out.println("Please Enter your married status : ");
		String status = sc.next();
		
		System.out.println();
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.print(address);
		System.out.println(collage_Id);
		System.out.println(collage_Name);
		System.out.println(email);
		System.out.println(status);
		
		sc.close();

	}

}
