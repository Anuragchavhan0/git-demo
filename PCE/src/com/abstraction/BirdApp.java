package com.abstraction;


// Rule no 1)
//1. We cannot instantiate an abstract class . We cannot create an object of abstract class.


abstract class Sparrow{
	abstract void eat();
	void fly() {
		System.out.println("Sparrow is flaying ");
	}
}

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sparrow s = new Sparrow();  cannot create a object.

	}

}
