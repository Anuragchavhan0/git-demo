package com.interface19;
import java.util.Scanner;
public class KodCalciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double num2;
		System.out.println("Welcome to calci ");
		double num1 = sc.nextDouble();
		AshwSoft a= new AshwSoft();
		String op = sc.next();
		num2 = sc.nextDouble();
		a.setNum(num1, num2);
		switch(op) {
		case "+":
			
			a.add();
			break;
		case "-":
			 
			 a.sub();
			break;
		case "*":
			
			a.mul();
			break;
		case "/":
			
			a.div();
			break;
		default:
			System.out.println("Enter the valid Operator");
		}
		sc.close();
	}
	static void duty(AshwSoft as) {
		as.add();
	}
}


