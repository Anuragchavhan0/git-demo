package com.calculator.app;
import java.util.Scanner;

import com.calculator.conversion.CelsiusToFahrenheit;
import com.calculator.conversion.GramsToKiloGrams;
import com.calculator.conversion.MetersToKilometers;
import com.calculator.conversion.RupeesToDollars;
import com.calculator.geometry.CircleArea;
import com.calculator.geometry.ReactangleArea;
import com.calculator.geometry.SquareArea;
import com.calculator.geometry.TriangleArea;
import com.calculator.interfaces.BasicOperations;
import com.calculator.operations.Addition;
import com.calculator.operations.Division;
import com.calculator.operations.Modulus;
import com.calculator.operations.Multiplication;
import com.calculator.operations.Substraction;

public class OOPBasedCalculatorApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean isRunning = true ;
		BasicOperations basicoperations=null;//ONLY reference created
		while(isRunning) {
			
		System.out.println("<<<<<< Welcom to CalciByAnurag >>>>>>");
		
		
		System.out.println("1.Basic Operations");
		System.out.println("2.Geometry ");
		System.out.println("3.Unit Coversion");
		int category = sc.nextInt();
		{
		if(category==1) {
		/*	System.out.println(" 1.Additon ");
			System.out.println(" 2.Substraction ");
			System.out.println(" 3.Multiplication ");
			System.out.println(" 4.Division ");
			System.out.println(" 5.Modulo "); 
			int choice =sc.nextInt();*/
			
			System.out.println("Enter First Number : ");
			double num1=sc.nextDouble();
			
			System.out.println("Choose the operator (+ - * / % : ");
			char operator= sc.next().charAt(0);
			
			System.out.println("Enter Second Number : ");
			double num2=sc.nextDouble();
			
			switch(operator) {
			
			case '+':
				basicoperations= new Addition(num1 ,num2);
				break;
			case '_':
				basicoperations= new Substraction(num1 ,num2);
				break;
			case '*':
				basicoperations= new Multiplication(num1 ,num2);
				break;
			case '/':
				basicoperations= new Division(num1 ,num2);
				break;
			case '%':
				basicoperations= new Modulus(num1 ,num2);
				break;
			
				
			}
		}
		else if (category==2) {
			System.out.println(" 1.Area of Circle  ");
			System.out.println(" 2.Area of Reactangle ");
			System.out.println(" 3.Area of Square  ");
			System.out.println(" 4.Area of Triangle ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter the radius : ");
				double r = sc.nextDouble();
				basicoperations=new CircleArea(r);
				break;
			case 2 :
				System.out.println("Enter the length : ");
				double l = sc.nextDouble();
				System.out.println("Enter the breath : ");
				double b = sc.nextDouble();
				basicoperations=new ReactangleArea(l,b);
				break;
			case 3 :
				System.out.println("Enter the Side of the Square  : ");
				double s = sc.nextDouble();
				basicoperations=new SquareArea(s);
				break;
			case 4 :
				System.out.println("Enter the height : ");
				double h = sc.nextDouble();
				System.out.println("Enter the base : ");
				double base = sc.nextDouble();
				basicoperations=new TriangleArea(h,base);
				break;
			
			}
		
				
		}
		
		else if(category==3) {
			System.out.println(" 1.Meters to Kilometers ");
			System.out.println(" 2.Grams to KiloGrams ");
			System.out.println(" 3.Ruppe to Dollers  ");
			System.out.println(" 4.Celsius to Fahernheit ");
			int choice = sc.nextInt();
			
			System.out.println("Enter the value : ");
			double value =sc.nextDouble();
			
			
			switch(choice) {
			case 1:
				basicoperations=new MetersToKilometers(value);
				break;
			case 2:
				basicoperations=new GramsToKiloGrams(value);
				break;	
			case 3:
				basicoperations=new RupeesToDollars(value);
				break;
			case 4:
				basicoperations=new CelsiusToFahrenheit(value);
				break;
			}
			
		}
		
		/*else {
			System.out.println("Do you want to calculate more ?? Y/N:) ");
			char yn=sc.next().charAt(0);
			
			if(isRunning =false) {
			System.out.println("Thank you for using CalciByAnurag :) ");
		}*/
			
		System.out.println("Result : "+basicoperations.Calculate());
		System.out.println("----------------------------------------");
		System.out.println("Do you want to calculate more ?? Y/N:) ");
		char yn=sc.next().charAt(0);
		
		if(yn=='N') {
			isRunning=false;
		System.out.println("Thank you for using CalciByAnurag :) ");
		}
		else {
			isRunning = true;
		}
	 }
		}

	}

}	

