package com.interface19;
import java.util.Scanner;


interface KodCalci{
	void add();
	void sub();
}
interface KodCalci2{
	void mul();
	void div();
	void setNum(double num1 , double num2) ;
	
}
public class AshwSoft implements KodCalci , KodCalci2{
	Scanner sc = new Scanner(System.in);
	double num1;
	double num2;
	double sum;
		 
	public void setNum(double num1 , double num2) {
		this.num1=num1;
		this.num2=num2;
	 }
	 

	@Override
	public void add() {
		  
		sum = num1+num2;
		System.out.println("The Addition is : " + sum);
		
	}

	@Override
	public void sub() {
		 sum = num1-num2;
		System.out.println("The Substraction is : " + sum);
	}
	@Override
	public void mul() {
		 sum = num1*num2;
		System.out.println("The Multiplicaton is : " + sum);
	}

	@Override
	public void div() {

		 sum = num1/num2;
		System.out.println("The division is : " + sum);
	}

}
