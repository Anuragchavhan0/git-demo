package com.abstraction;
/*

//4.If a child class only partially implement the method of an abstract class the child class itself should also declared as abstract class.

abstract class bird{
	abstract void eat();
	 abstract void fly();	
	 }

abstract  class sparrow4 extends bird{
	void  fly() {
		System.out.println("flying ");
	}
	}
class VegSparrow extends sparrow4{
	void eat() {
		System.out.println("Sparrow eat grains ");
	}
}
class NonVegSparrow extends sparrow4{
	void eat() {
		System.out.println("Sparrow eats worms ");
	}
}
	
	
public class BirdClassRule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duty(new VegSparrow());
		duty(new NonVegSparrow());

	}
	static void duty(bird b ) {
		b.eat();
		b.fly();
	}

}

*/