package com.inheritance;

//3. The constructor of a class also does not participate in inheritance. .
//However The parent class constructor is called because of constructor chaining.

public class RullNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 c = new Child3();
		

		}
}
class Parent3{
	public Parent3() {
		System.out.println(" This is parent Constructor :");
	}
}
class Child3 extends Parent{
	public Child3() {
		System.out.println(" This is parent Constructor :");
	}
}