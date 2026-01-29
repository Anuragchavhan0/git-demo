package com.polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tendulkar t = new ArjunTendulkar();
		t.job();
		t.Profession();
		// t.smoke(); We cannot  asses  the child class method into parent class. that's why 
		// we have to overide
		((ArjunTendulkar)t).smoke();
	}

}

class Tendulkar{
	void job() {
		System.out.println("Play  Cricket");
	}
	void Profession() {
		System.out.println("Batsman");
	}
}
class ArjunTendulkar extends Tendulkar{
	void job() {
		System.out.println("Play  Cricket"); // Inheritance
	}
	void Profession() {
		System.out.println("Bowler"); // Overriden
	}
	void smoke() {
		System.out.println("smoker");//Specilized method 
	}
}
