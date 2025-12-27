package com.staticc;
import  java.util.Scanner;
class Triangle{
	float h;
	float b;

	public Triangle(float h , float b) {
		this.h=h;
		this.b=b;	
	}
	float disp() {
		float area= (b*h)/2;
		return area;
}
}
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the height of triangle : ");
		float h =sc.nextFloat();
		System.out.println(" Enter the base of triangle : ");
		float b =sc.nextFloat();
		
		Triangle t = new Triangle(h,b);
		System.out.println(t.disp());
	}

}
