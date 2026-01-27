package com.interface19;

public class AnuragInfoTech implements KodCalci {

	@Override
	public void add() {
		int a =10;
		int b = 20;
		int sum=a+b;
		System.out.println("The Addition of 10+20 is "+sum);
		
	}

	
	public void sub() {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		int sum=a-b;
		System.out.println("The Substraction of 10-20 is "+sum);
	}


	public void mul() {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		int sum=a*b;
		System.out.println("The Multiplication of 10*20 is "+sum);
	}


	public void div() {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		int sum=a/b;
		System.out.println("The division of 10/20 is "+sum);
	}

	

}
