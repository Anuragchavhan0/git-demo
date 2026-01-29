package com.encapsulation;
class Emplyoeee{
	int emp_id;
	String name;
	int salary;
	
public Emplyoeee() {
	this(101,"arsh",30);
	System.out.println("0 paramitrize costructor is called ");	
}
public Emplyoeee(int emp_id) {
	System.out.println("1 paramitrize costructor is called ");	
}
public Emplyoeee(int emp_id , String name) {
	this(101);
	System.out.println("2 paramitrize costructor is called ");	
}
public Emplyoeee(int emp_id , String name,int salary ) {
	this(101,"arsh");
	System.out.println("3 paramitrize costructor is called ");	
}

}

public class emplyoee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoeee e = new Emplyoeee();
		

	}

}
