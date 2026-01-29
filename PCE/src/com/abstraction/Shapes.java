package com.abstraction;

import java.util.Scanner;

abstract class Shapes1 {
	double area;
	abstract void disp();
	abstract void findArea();
}

class Circle1 extends Shapes1{
	static float pi=3.14f;
	float rad;
	public Circle1 (float rad) {
		this.rad = rad;	
	}
	public void disp() {
		 area= pi*rad*rad;
		
	}
	void findArea() {
	System.out.println("The area of a tringle " +area);
	}
	
}

class Triangle1 extends Shapes1 {
	float h;
	float b;

	public Triangle1(float h , float b) {
		this.h=h;
		this.b=b;	
	}
	public void disp() {
		 area= (b*h)*0.5f;
		
    }
	void findArea() {
		System.out.println("The area of a tringle " + area);
	}
}	

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the radius of circle : ");
		float rad = sc.nextFloat();
		
		 area( new Circle1(rad));
		System.out.println(" Enter the height of triangle : ");
		float h =sc.nextFloat();
		System.out.println(" Enter the base of triangle : ");
		float b =sc.nextFloat();
		
		area( new Triangle1(h,b));

	}
	
	static void area(Shapes1 sp) {
		sp.disp();
		sp.findArea();
	}

}
//entity

