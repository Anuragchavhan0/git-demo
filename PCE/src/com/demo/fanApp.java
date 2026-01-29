package com.demo;

class Fan {
	String brand;
	String color;
	int price;
	
	void fan1() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
}

public class fanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan f1 = new Fan();
		f1.brand = "Asdf";
		f1.color=" white" ;
		f1.price = 20000;
		
		Fan f2 = new Fan();
		f2.brand = "kfkdjfkjf";
		f2.color=" Red" ;
		f2.price = 15000;
		
		f1.fan1();
		System.out.println();
		f2.fan1();

	}

}
