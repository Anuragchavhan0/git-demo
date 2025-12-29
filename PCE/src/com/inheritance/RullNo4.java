package com.inheritance;

public class RullNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();

	}

}
class Parent1{
	public Parent1() {
		System.out.println(" This is parent Constructor :");
	}
}
class Parent2{
	public Parent2() {
		System.out.println(" This is parent Constructor :");
	}
}
class Child extends Parent1 , Parent2{
	public Child() {
		System.out.println(" This is child Constructor :");
	}
}
//4. Multiple inheritance is not allowed in java this is because ambiquity 
// might arise & diamond shape(Multiple (inheritance) problem also exists.

//Syntax error 
