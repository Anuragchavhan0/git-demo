package com.inheritance;

class ParentA{
	Animal disp() {
		Animal a = new Animal();
		return a;
	}
}
class ChildA extends ParentA{
	Dog disp() {
		Dog b = new Dog();
		return b;
	}
}

class Animal{
	
}
class Dog extends Animal{
	
}
public class RullNo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildA ch = new ChildA();
		System.out.println(ch);
	}

}
