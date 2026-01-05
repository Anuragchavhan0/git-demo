package com.exception;

import java.util.Scanner;

class Test1{
	void alpha() {
		System.out.println("Connection 1 establish : ");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("Connection 1 Terminated : ");
	}
}
class Test2{
	void beta() {
		System.out.println("Connection 1 establish : ");
		Test3 t3 = new Test3();
		t3.gamma();
		System.out.println("Connection 1 Terminated : ");
	}
}
class Test3{
	void gamma() {
		System.out.println("Connection 1 establish : ");
		Scanner sc = new  Scanner(System.in);
		System.out.print("Please Enter 1st number :   ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd number :   ");
		int b = sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception handled by gamma ");

		}
		
		System.out.println("Connection 3 Terminated : ");
	}
}
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main Connection establish : ");
		Test1 t1= new Test1();
		t1.alpha();
		System.out.println(" main Connection Terminated : ");

	}

}
